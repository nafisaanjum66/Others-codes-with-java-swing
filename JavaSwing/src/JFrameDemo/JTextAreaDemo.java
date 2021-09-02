
package JFrameDemo;

import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaDemo extends JFrame{
    
    private Container c;
    private JTextArea ta;
    private Font f;
    private JScrollPane sc;
    
    JTextAreaDemo(){
        initComponents();
    }
    
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(java.awt.Color.CYAN);
        
        f = new Font("Arial",Font.BOLD,18);
        
        ta = new JTextArea();
        
        ta.setFont(f);
        //ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setForeground(java.awt.Color.BLUE);
        ta.setBackground(java.awt.Color.PINK);
        
        
        sc = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sc.setBounds(50,50,400,400);
        c.add(sc);
        
    }
    
    
    public static void main(String[] args) {
        JTextAreaDemo jta = new JTextAreaDemo();
        jta.setVisible(true);
        jta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jta.setBounds(100,100,500,600);
        jta.setTitle("JText Area Demo");
        
    }
    
}
