
package LayoutManagerDemo;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutDemo extends JFrame implements ActionListener{
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private CardLayout cl;
    
    
    CardLayoutDemo()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        cl = new CardLayout(20,10);
        c.setLayout(cl);
        
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        
        c.add(btn1,"one");
        c.add(btn2,"two");
        c.add(btn3,"three");
        c.add(btn4,"four");
        c.add(btn5,"five");
        
        cl.show(c, "three");
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        //cl.next(c);
        cl.previous(c);
        //cl.first(c);
        //cl.last(c);
        //cl.show(c, "four");
    }
    
    public static void main(String[] args) {
        CardLayoutDemo cl = new CardLayoutDemo();
        cl.setVisible(true);
        cl.setBounds(100,100,500,600);
        cl.setTitle("Card Layout demo");
        cl.setResizable(true);
    }

    
    
}
