package gon.cue.core;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class FSAcess {
    
    public boolean runWithPrivileges() {
        InputStreamReader input;
        OutputStreamWriter output;

        try {

            Process pb = new ProcessBuilder(new String[]{"/bin/bash", "-c", "/usr/bin/sudo -S /bin/cat /etc/sudoers 2>&1"}).start();

            output = new OutputStreamWriter(pb.getOutputStream());
            input = new InputStreamReader(pb.getInputStream());

            int bytes, tryies = 0;
            char buffer[] = new char[1024];
            while ((bytes = input.read(buffer, 0, 1024)) != -1) {
                if (bytes == 0)
                    continue;
                //Output the data to console, for debug purposes
                String data = String.valueOf(buffer, 0, bytes);
                System.out.println(data);
                // Check for password request
                if (data.contains("[sudo] password")) {
                    // Here you can request the password to user using JOPtionPane or System.console().readPassword();
                    // I'm just hard coding the password, but in real it's not good.
                    char password[] = new char[]{'t', 'e', 's', 't'};
                    output.write(password);
                    output.write('\n');
                    output.flush();
                    // erase password data, to avoid security issues.
                    Arrays.fill(password, '\0');
                    tryies++;
                }
            }

            return tryies < 3;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
