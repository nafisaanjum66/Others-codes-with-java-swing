
package LayoutManagerDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame {
    private Container c;
    private JButton btns[];
    private FlowLayout fl;
    
    
    FlowLayoutDemo(){
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        fl = new FlowLayout(FlowLayout.LEFT);
        fl.setHgap(10);
        fl.setVgap(20);
        
        c.setLayout(fl);
        
        
        btns= new JButton[9];
        
        for (int i = 0; i < 9; i++) {
            btns[i]= new JButton(" " + (i+1) );
            c.add(btns[i]);
        }
    }
    
    public static void main(String[] args) {
        FlowLayoutDemo fl = new FlowLayoutDemo();
        fl.setVisible(true);
        fl.setBounds(100,100,400,500);
        fl.setTitle("FlowLayoutDemo");
    }
    
}
