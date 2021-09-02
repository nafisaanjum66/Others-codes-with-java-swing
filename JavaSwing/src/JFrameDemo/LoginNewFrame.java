
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginNewFrame extends JFrame{
    
    private Container c;
    private JLabel jl;
    
    LoginNewFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400,50,500,600);
        this.setTitle("New Frame");
        this.setResizable(true);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);
        
        jl= new JLabel("welcome to the new Frame...");
        jl.setBounds(50,50,170,50);
        c.add(jl);
        
    }
    
    public static void main(String[] args) {
        
        LoginNewFrame nf = new LoginNewFrame();
        nf.setVisible(true);
    }
    
}
