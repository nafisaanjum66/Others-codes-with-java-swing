
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo extends JFrame{
    private ImageIcon icon,img;
    private Container c;
    private JLabel lbl,lbl2,imglbl;
    private Font f;
    
    JLabelDemo(){
        initComponents();
    }
    
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);
        
        icon = new ImageIcon(getClass().getResource("panda.png"));
        this.setIconImage(icon.getImage());
        
        f = new Font("Arial",Font.BOLD,14);
        
        lbl = new JLabel();
        lbl.setText("Enter panda's name :");
        lbl.setBounds(50,20,200,100);
        lbl.setFont(f);
        lbl.setForeground(Color.red);
        lbl.setOpaque(true);
        lbl.setBackground(Color.yellow);
        lbl.setToolTipText("Enter Name");
        c.add(lbl);
        
        //System.out.println(lbl.getText());
        
        String s = lbl.getToolTipText();
        System.out.println(s);
        
        lbl2 = new JLabel("Enter Panda password :");
        lbl2.setBounds(50, 90, 200, 150);
        lbl2.setFont(f);
        lbl2.setForeground(Color.black);
        lbl2.setOpaque(true);
        lbl2.setBackground(Color.white);
        lbl2.setToolTipText("Enter Password");
        c.add(lbl2);
        
        img = new ImageIcon(getClass().getResource("panda.png"));
        imglbl = new JLabel(img);
        imglbl.setBounds(150, 270, img.getIconHeight(), img.getIconWidth());
        imglbl.setToolTipText("It's a Panda.");
        c.add(imglbl);
        
    }
    
    
    public static void main(String[] args) {
        JLabelDemo jl = new JLabelDemo();
        jl.setVisible(true);
        jl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jl.setBounds(400,200,800,900);
        jl.setTitle("Panda");
        jl.setResizable(true);
        
    }
    
}
