
package ListenerDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class FocusListenerDemo extends JFrame {
    private Container c;
    private JButton btn;
    private JTextArea ta;
    private Font f;
    
    
    FocusListenerDemo()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        f = new Font("Callibri",Font.BOLD,18);
        
        btn = new JButton("Test");
        btn.setBounds(10,50,150,50);
        btn.setForeground(Color.RED);
        btn.setFont(f);
        c.add(btn);
        
        ta = new JTextArea();
        ta.setBounds(170,50,300,400);
        ta.setFont(f);
        c.add(ta);
        
        btn.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent fe) {
                
                ta.append("Focus Gained \n");
            }

            @Override
            public void focusLost(FocusEvent fe) {
                ta.append ("Focus Lost \n");
            }
        
        
        });
        
    }
    
    
    public static void main(String[] args) {
        FocusListenerDemo fc = new FocusListenerDemo();
        fc.setVisible(true);
        fc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fc.setBounds(100,100,500,600);
        fc.setTitle("Focus Listener");
        fc.setResizable(true);
    }
    
}
