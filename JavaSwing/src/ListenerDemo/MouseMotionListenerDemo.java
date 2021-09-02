
package ListenerDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseMotionListenerDemo extends JFrame {
    private Container c;
    private JTextArea ta;
    private JTextField tf;
    
    MouseMotionListenerDemo()
    {
        initComponents();
    }
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        ta = new JTextArea();
        ta.setBounds(10,30,300,400);
        c.add(ta);
        
        tf = new JTextField();
        tf.setBounds(320,30,250,50);
        c.add(tf);
        
        ta.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent me) {
                tf.setText("Mouse Dragged :"+me.getX()+"X"+me.getY());
                
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                tf.setText("Mouse Moved :"+me.getX()+"X"+me.getY());
                
            }
        
        
        
        });
    }
    
    
    public static void main(String[] args) {
        MouseMotionListenerDemo ms = new MouseMotionListenerDemo();
        ms.setVisible(true);
        ms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ms.setBounds(100,100,600,500);
        ms.setTitle("Mouse Motion Listener Demo");
        ms.setResizable(true);
    }
    
}
