package gon.cue.ui.components;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;

public class Bar extends Menu{
    
    public Bar(Shell shell){
        super(shell,SWT.BAR);
        
        shell.setMenuBar(this);
        
        constructMenus();
    }

    private void constructMenus() {
        // TODO Auto-generated method stub
        
    }
    
}
