
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class JRadioButtonDemo extends JFrame{
    private Container c;
    private JRadioButton btn1,btn2; 
    private ButtonGroup grp;
    private Font f;
    private JTextArea ta;
    
    JRadioButtonDemo(){
        initComponents();
    }
    
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,400,500);
        this.setTitle("JRadioButton demo");
        this.setResizable(true);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.MAGENTA);
        
        f = new Font("Callibri",Font.BOLD,20);
        grp = new ButtonGroup();
        
        btn1 = new JRadioButton("Male");
        btn1.setBounds(50,50,100,50);
        btn1.setForeground(Color.BLUE);
        btn1.setBackground(Color.MAGENTA);
        // btn1.setSelected(true);
        btn1.setFont(f);
        c.add(btn1);
        
        btn2 = new JRadioButton("Female");
        btn2.setBounds(160,50,100,50);
        btn2.setForeground(Color.blue);
        btn2.setBackground(Color.magenta);
        //btn2.setEnabled(false);
        btn2.setFont(f);
        c.add(btn2);
        
        grp.add(btn1);
        grp.add(btn2);
        
        ta = new JTextArea();
        ta.setBounds(30,120,300,250);
        ta.setFont(f);
        c.add(ta);
        
        Handeler hd = new Handeler();
        btn1.addActionListener(hd);
        btn2.addActionListener(hd);
    }
    
    
    class Handeler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(btn1.isSelected()){
                    ta.append("Male is selected.\n");
                }else{
                    ta.append("Female is selected.\n ");
                    
                }
            
            
        }
        
    }
            
    
    public static void main(String[] args) {
        JRadioButtonDemo jr = new JRadioButtonDemo();
        jr.setVisible(true);
        
    }
    
}
