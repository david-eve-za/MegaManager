package gon.cue.core.ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class BaseGraphics {
    protected Display display;
    protected Shell shell;
    
    public BaseGraphics() {
        initDisplay();
        initShell();
    }
    
    public void openWindow(){
        this.shell.open();
        keepOpen();
    }

    private void keepOpen() {
        while (!this.shell.isDisposed()) {
            if (!this.display.readAndDispatch())
                this.display.sleep();
        }
    }

    private void initShell() {
        this.shell = new Shell(display);
        this.shell.setSize(800, 600);
    }

    private void initDisplay() {
        this.display = new Display();
    }
}
