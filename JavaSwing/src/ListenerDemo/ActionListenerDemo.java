
package ListenerDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ActionListenerDemo extends JFrame implements ActionListener {
    
    private Container c;
    private JButton btn1,btn2,btn3;
    private Font f;
    
    ActionListenerDemo(){
        c = this.getContentPane();
        c.setLayout(null);
        
        f = new Font("Callibri",Font.BOLD,18);
        
        btn1 = new JButton("Red");
        btn1.setBounds(100,100,150,50);
        btn1.setForeground(Color.RED);
        btn1.setFont(f);
        c.add(btn1);
        
        btn2 = new JButton("Blue");
        btn2.setBounds(100,160,150,50);
        btn2.setForeground(Color.BLUE);
        btn2.setFont(f);
        c.add(btn2);
        
        btn3 = new JButton("Pink");
        btn3.setBounds(100,220,150,50);
        btn3.setForeground(Color.PINK);
        btn3.setFont(f);
        c.add(btn3);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==btn1)
        {
            c.setBackground(Color.RED);
        }
        else if(e.getSource()==btn2)
        {
            c.setBackground(Color.BLUE);
        }
        else if(e.getSource()==btn3)
        {
            c.setBackground(Color.PINK);
        }
        
    }
    
    
    public static void main(String[] args) {
        ActionListenerDemo ac = new ActionListenerDemo();
        ac.setVisible(true);
        ac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ac.setBounds(100,100,500,600);
        ac.setTitle("Action Listener");
        ac.setResizable(true);
    }

    
    
}
