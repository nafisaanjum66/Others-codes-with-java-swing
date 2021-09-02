 
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class actionListenerDemo2 extends JFrame{
    private Container c;
    private ImageIcon img;
    private JTextField tf1,tf2;
    
    
    actionListenerDemo2(){
        initComponents();
        
    }
    
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        img = new ImageIcon(getClass().getResource("diamond.png"));
        this.setIconImage(img.getImage());
        
        tf1 = new JTextField();
        tf1.setBounds(100,50,200,50);
        c.add(tf1);
        
        tf2 = new JTextField();
        tf2.setBounds(100,120,200,50);
        c.add(tf2);
        
        Handeler hd = new Handeler();
        tf1.addActionListener(hd);
        tf2.addActionListener(hd);
        
        
    }
    class Handeler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==tf1){
                String s = tf1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "You entered nothing");
                }else{
                    JOptionPane.showMessageDialog(null,"Your text is : " +s,"This is tf1",2);
                }
                
            }else{
                String s1= tf2.getText();
                if(s1.isEmpty()){
                    JOptionPane.showMessageDialog(null,"You entered nothing .");
                }else{
                    JOptionPane.showMessageDialog(null,"Your text is :" +s1,"This is tf2",0);
                }
            }
        }
    }
    

    
    
    public static void main(String[] args) {
        
        actionListenerDemo2 ac2 = new actionListenerDemo2 ();
        ac2.setVisible(true);
        ac2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ac2.setBounds(100,100,500,600);
        ac2.setTitle("Action Listener Demo 2");
        ac2.setResizable(true);
        
    }
    
}
