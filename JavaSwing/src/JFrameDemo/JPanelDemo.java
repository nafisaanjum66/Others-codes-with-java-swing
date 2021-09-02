
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelDemo extends JFrame {
    private Container c;
    private JPanel p1,p2;
    private JButton btn1,btn2,btn3;
    
    JPanelDemo()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        p1 = new JPanel();
        p1.setBounds(50,100,300,350);
        p1.setBackground(Color.RED);
        c.add(p1);
        
        p2 = new JPanel();
        p2.setBounds(430,100,300,350);
        p2.setBackground(Color.BLUE);
        c.add(p2);
        
        btn1 = new JButton("dana");
        //btn1.setBounds(100,50,150,50);
        p1.add(btn1);
        
        btn2 = new JButton("purba");
        //btn2.setBounds(100,50,150,50);
        p1.add(btn2);
    }
    
    
    public static void main(String[] args) {
        JPanelDemo jp = new JPanelDemo();
        jp.setVisible(true);
        jp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jp.setBounds(100,100,800,600);
        jp.setTitle("JPanel demo");
        jp.setResizable(true);
    }
    
}
