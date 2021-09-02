
package LayoutManagerDemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class BoxLayoutDemo extends JFrame{
    
    
     private Container c;
    private BoxLayout bx;
    private JButton btn1,btn2,btn3,btn4,btn5;
    
    BoxLayoutDemo(){
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        bx = new BoxLayout(c,BoxLayout.X_AXIS);
        
        c.setLayout(bx);
        c.setBackground(Color.CYAN);
        
        btn1 = new JButton("north");
        btn2 = new JButton("east");
        btn3 = new JButton("west");
        btn4 = new JButton("center");
        btn5 = new JButton("south");
        
        c.add(btn1);
        
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
       
    }
    
    public static void main(String[] args) {
        BoxLayoutDemo bl = new BoxLayoutDemo();
        bl.setVisible(true);
        bl.setBounds(100,100,500,600);
        bl.setTitle("Border Layout Demo");
    }
    
    
    
}
