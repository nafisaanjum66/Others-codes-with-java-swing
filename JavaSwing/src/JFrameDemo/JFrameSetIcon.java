
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameSetIcon extends JFrame{
    
    private ImageIcon icon;
    private Container c;
    
    JFrameSetIcon(){
        setComponent();
    }
    
    public void setComponent(){
        c= this.getContentPane();
        c.setBackground(Color.magenta);
        
        
        icon = new ImageIcon(getClass().getResource("diamond.png"));
        this.setIconImage(icon.getImage());
        
    }
    
    
    public static void main(String[] args) {
        JFrameSetIcon fr = new JFrameSetIcon();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(400,500,400,300);
        fr.setResizable(true);
        fr.setTitle("Diamond Demo");
        
    }
    
}
