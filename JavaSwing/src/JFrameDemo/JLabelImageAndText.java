
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JLabelImageAndText extends JFrame {
    
    private Container c;
    private ImageIcon img;
    private JLabel lbl;
    
    JLabelImageAndText()
    {
        initComponents();
    }
    
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        img = new ImageIcon(getClass().getResource("panda.png"));
        
        lbl = new JLabel("This is a panda",img,JLabel.LEFT);
        lbl.setBounds(50,50,500,300);
        c.add(lbl);
        
    }
            
    
    
    public static void main(String[] args) {
        JLabelImageAndText imtx = new JLabelImageAndText();
        imtx.setVisible(true);
        imtx.setBounds(100,100,500,600);
        imtx.setTitle("image and text");
    }
    
}
