
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonDemo extends JFrame {
     
    private Container c;
    private JButton btn1,btn2;
    private Font f1,f2;
    private Cursor cr1,cr2;
    private ImageIcon img1,img2;
    
    JButtonDemo(){
        initComponents();
    }
    
    public void initComponents(){
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f1 = new Font("Arial",Font.BOLD,22);
        f2 = new Font("Callibri",Font.BOLD,22);
        
        cr1 = new Cursor(Cursor.HAND_CURSOR);
        cr2 = new Cursor(Cursor.CROSSHAIR_CURSOR);
        
        img1 = new ImageIcon(getClass().getResource("diamond.png"));
        img2 = new ImageIcon(getClass().getResource("close.png"));
        
        btn1 = new JButton(img1);
        btn1.setBounds(100, 50,100 , 50);
        btn1.setFont(f1);
        btn1.setCursor(cr1);
        
        /*btn1.setForeground(Color.BLUE);
        btn1.setBackground(Color.YELLOW);*/
        c.add(btn1);
        
        
        btn2 = new JButton(img2);
        //btn2.setText("Dana");
        btn2.setBounds(220,50,100,50);
        btn2.setCursor(cr2);
        btn2.setFont(f2);
        /*btn2.setForeground(Color.GREEN);
        btn2.setBackground(Color.RED);*/
        c.add(btn2);
    }
            
    
    public static void main(String[] args) {
        JButtonDemo jb = new JButtonDemo();
        jb.setVisible(true);
        jb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jb.setBounds(200,100,500,600);
        jb.setTitle("Button Demo");
        jb.setResizable(true);
    }
}
