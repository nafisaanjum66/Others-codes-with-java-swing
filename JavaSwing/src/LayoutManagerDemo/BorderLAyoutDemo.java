
package LayoutManagerDemo;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLAyoutDemo extends JFrame {
    private Container c;
    private BorderLayout bl;
    private JButton btn1,btn2,btn3,btn4,btn5;
    
    BorderLAyoutDemo(){
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        bl = new BorderLayout();
        bl.setHgap(10);
        bl.setVgap(5);
        c.setLayout(bl);
        
        btn1 = new JButton("north");
        btn2 = new JButton("east");
        btn3 = new JButton("west");
        btn4 = new JButton("center");
        btn5 = new JButton("south");
        
        c.add(btn1,BorderLayout.NORTH);
        c.add(btn2,BorderLayout.EAST);
        c.add(btn3,BorderLayout.WEST);
        c.add(btn4,BorderLayout.CENTER);
        c.add(btn5,BorderLayout.SOUTH);
       
    }
    
    public static void main(String[] args) {
        BorderLAyoutDemo bl = new BorderLAyoutDemo();
        bl.setVisible(true);
        bl.setBounds(100,100,500,600);
        bl.setTitle("Border Layout Demo");
    }
    
    
    
}
