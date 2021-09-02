
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class JTextFieldDemo extends JFrame{
    
    private Container c;
    private JTextField tf1,tf2;
    private Font f1,f2;
    
    JTextFieldDemo(){
        initComponents();
    }
    
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        f1= new Font("Arial",Font.ITALIC + Font.BOLD ,18);
        f2 = new Font("Callibri",Font.ITALIC + Font.BOLD ,14);
        
        tf1 = new JTextField();
        tf1.setBounds(50,50,200,50);
        tf1.setFont(f1);
        tf1.setBackground(Color.GREEN);
        tf1.setForeground(Color.BLUE);
        tf1.setHorizontalAlignment(JTextField.RIGHT);
        c.add(tf1);
        
        tf2 = new JTextField();
        tf2.setText("PURBA");
        tf2.setBounds(50,150,200,50);
        tf2.setFont(f2);
        tf2.setBackground(Color.BLUE);
        tf2.setForeground(Color.RED);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);
        
        
    }
    
    
    public static void main(String[] args) {
        JTextFieldDemo jtf = new JTextFieldDemo();
        jtf.setVisible(true);
        jtf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtf.setBounds(100,50,500,400);
        jtf.setTitle("Text Field");
        jtf.setResizable(true);
        
    }
    
}
