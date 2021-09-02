
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginFrameDemo extends JFrame {
    
    private Container c;
    private JLabel lbl1,lbl2;
    private Font f;
    private JTextField jf;
    private JPasswordField pf;
    private JButton btn1,btn2;
    
    
    LoginFrameDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,600);
        this.setTitle("Login Frame demo");
        this.setResizable(true);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f = new Font("Arial",Font.BOLD,18);
        
        lbl1 = new JLabel("User Name :");
        lbl1.setBounds(50,50,150,50);
        lbl1.setFont(f);
        c.add(lbl1);
        
        lbl2 = new JLabel("Password :");
        lbl2.setBounds(50,110,150,50);
        lbl2.setFont(f);
        c.add(lbl2);
        
        jf = new JTextField();
        jf.setBounds(210,50 ,150 ,50 );
        jf.setFont(f);
        c.add(jf);
        
        pf = new JPasswordField();
        pf.setBounds(210,110,150,50);
        pf.setEchoChar('*');
        pf.setFont(f);
        c.add(pf);
        
        btn1 = new JButton("Login");
        btn1.setBounds(120,180,100,50);
        btn1.setFont(f);
        c.add(btn1);
        
        btn2 = new JButton("Cancel");
        btn2.setBounds(250,180,100,50);
        btn2.setFont(f);
        c.add(btn2);
        
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String uname = jf.getText();
                String pass = pf.getText();
                
                if(uname.equals("Dana") && pass.equals("1234")){
                    JOptionPane.showMessageDialog(null,"You logged in succesfully","Welcome",1);
                    //dispose();
                    
                    LoginNewFrame nf = new LoginNewFrame();
                    nf.setVisible(true);
                    nf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }else{
                    JOptionPane.showMessageDialog(null, "You entered wrong username or password", "Error", 0);
                }
                
                
            }
        
        
        });
        
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                jf.setText("");
                pf.setText("");
                
            }
        
        
        });
        
        
        
    }
    
    
    public static void main(String[] args) {
        LoginFrameDemo lg = new LoginFrameDemo();
        lg.setVisible(true);
        
    }
    
}
