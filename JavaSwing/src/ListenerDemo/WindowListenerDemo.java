
package ListenerDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class WindowListenerDemo extends JFrame {
    private Container c;
    
    
    WindowListenerDemo()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        this.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent we) {
                System.out.println("windowOpened");
            }

            @Override
            public void windowClosing(WindowEvent we) {
                System.out.println("windowClosing");
            }

            @Override
            public void windowClosed(WindowEvent we) {
                System.out.println("windowClosed");
            }

            @Override
            public void windowIconified(WindowEvent we) {
                System.out.println("windowIconified");
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
                System.out.println("windowDeiconified");
            }

            @Override
            public void windowActivated(WindowEvent we) {
                System.out.println("windowActivated");
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
                System.out.println("windowDeactivated");
            }
        
        
        
        
        });
        
        
                 
    }
            
    
    
    
    public static void main(String[] args) {
        WindowListenerDemo wn = new WindowListenerDemo();
        wn.setVisible(true);
        wn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wn.setBounds(100,100,500,600);
        wn.setTitle("Window listener");
        wn.setResizable(true);
    }
    
}
