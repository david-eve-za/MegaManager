package gon.cue;


import gon.cue.core.FSAcess;
import gon.cue.model.crud.Operations;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(new FSAcess().runWithPrivileges("/bin/bash","-c","/usr/bin/sudo -S /bin/cat /etc/sudoers 2>&1"));
        

        Operations.getOperations().recreateDataBase();
    }
}
