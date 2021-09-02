
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class JPasswordFieldDemo extends JFrame{
    private Container c;
    private JPasswordField pf;
    private Font f;
    
    JPasswordFieldDemo(){
        initComponents();
    }
    
    public void initComponents(){
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        f= new Font("Arial",Font.BOLD,24);
        
        pf = new JPasswordField();
        pf.setEchoChar('*');
        pf.setFont(f);
        pf.setForeground(Color.BLACK);
        pf.setBackground(Color.PINK);
        pf.setBounds(100,50,200,50);
        c.add(pf);
    }
    
    
    
    public static void main(String[] args) {
        JPasswordFieldDemo pf = new JPasswordFieldDemo();
        pf.setVisible(true);
        pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pf.setBounds(100,100,500,600);
        pf.setTitle("Password demo");
        pf.setResizable(true);
    }
    
}
