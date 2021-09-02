
package ListenerDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseListenerDemo extends JFrame {
    
    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane sc;
    private Font f;
    
    MouseListenerDemo()
    {
        initComponents();
    }
    
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        f = new Font("Callibri",Font.BOLD,18);
        
        tf = new JTextField();
        tf.setBounds(100,50,200,50);
        tf.setFont(f);
        c.add(tf);
        
        ta = new JTextArea();
        ta.setBackground(Color.GREEN);
        ta.setFont(f);
        
        sc =new JScrollPane(ta);
        sc.setBounds(50,110,400,400);
        c.add(sc);
        
        tf.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                ta.append("Mouse Clicked \n");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                ta.append("Mouse Pressed \n");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                ta.append("Mouse Released \n");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                ta.append("Mouse Entered \n");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                ta.append("Mouse Exited \n");
            }
        
        
        });
                
        
    }
    
    public static void main(String[] args) {
        MouseListenerDemo ms = new MouseListenerDemo();
        ms.setVisible(true);
        ms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ms.setBounds(100,100,600,700);
        ms.setTitle("Mouse Listener Demo");
        ms.setResizable(true);
        
    }
    
}
