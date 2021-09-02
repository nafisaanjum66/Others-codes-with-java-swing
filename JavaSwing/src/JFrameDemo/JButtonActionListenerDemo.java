
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class JButtonActionListenerDemo extends JFrame {
    
    private Container c;
    private JTextField tf;
    private JButton btn;
    
    JButtonActionListenerDemo(){
        initComponents();
    }
    
    public void initComponents(){
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        tf = new JTextField();
        tf.setBounds(100,50,200,50);
        c.add(tf);
        
        btn = new JButton("CLEAR");
        btn.setBounds(100,110,100,50);
        c.add(btn);
        
        btn.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                tf.setText("");
                 
            }
        
        });
        
        
    }
    
    
    public static void main(String[] args) {
        JButtonActionListenerDemo jb = new JButtonActionListenerDemo();
        jb.setVisible(true);
        jb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jb.setBounds(100,100,500,600);
        jb.setTitle("JButton action listener demo");
    }
    
}
