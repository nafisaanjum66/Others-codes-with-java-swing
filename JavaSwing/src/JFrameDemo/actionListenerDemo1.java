
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class actionListenerDemo1 extends JFrame {
    
    private Container c;
    private JTextField tf1,tf2;
    
    
    actionListenerDemo1(){
        initComponents();
    }
    
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);
        
        tf1 = new JTextField();
        tf1.setBounds(100,50,100,50);
        c.add(tf1);
        
        tf2 = new JTextField();
        tf2.setBounds(100,110,100,50);
        c.add(tf2);
        
        tf1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                
                String s = tf1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please enter some text in this field .");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Your text on text field one : "+s,"Text Field One",JOptionPane.QUESTION_MESSAGE);
                }
            
            }
        
        
        });
        
        tf2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                String s1 = tf2.getText();
                if(s1.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please enter some text is this field .");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Your text on text field two : "+s1, "Text field two", 2);
                }
            }
            
        
        
        });
    }
    
    
    public static void main(String[] args) {
        
        actionListenerDemo1 ac = new actionListenerDemo1();
        ac.setVisible(true);
        ac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ac.setBounds(100,50,400,300);
        ac.setTitle("Action Listener demo1");
        ac.setResizable(true);
        
    }
    
}
