
package LayoutManagerDemo;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class GridLayoutDemo extends JFrame {
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private GridLayout gl;
    
    
    GridLayoutDemo(){
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        gl = new GridLayout(2,2);
        c.setLayout(gl);
        
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
    }
    
    
    public static void main(String[] args) {
        GridLayoutDemo gl = new GridLayoutDemo();
        gl.setVisible(true);
        gl.setBounds(100,100,500,600);
        gl.setTitle("Grid Layout");
        
    }
    
}
