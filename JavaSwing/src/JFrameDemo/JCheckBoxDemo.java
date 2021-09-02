
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JCheckBoxDemo extends JFrame {
    private Container c;
    private JCheckBox cbx1,cbx2,cbx3;
    private Font f;
    private ButtonGroup grp;
    private JLabel lbl;
    
    JCheckBoxDemo(){
        initComponents();
    }
    
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,400,500);
        this.setTitle("Check box demo");
        this.setResizable(true);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        grp = new ButtonGroup();
        
        f = new Font("Callibri",Font.ITALIC + Font.BOLD ,18);
        
        cbx1 = new JCheckBox("Nafisa");
        cbx1.setBounds(50,100,100,50);
        cbx1.setFont(f);
        cbx1.setForeground(Color.BLUE);
        cbx1.setBackground(Color.CYAN);
        c.add(cbx1);
        
        
        cbx2 = new JCheckBox("Anjum");
        cbx2.setBounds(50,160,100,50);
        cbx2.setFont(f);
        cbx2.setForeground(Color.BLUE);
        cbx2.setBackground(Color.CYAN);
        c.add(cbx2);
        
        
        cbx3 = new JCheckBox("Dana"/*,true*/ );
        cbx3.setBounds(50,220,100,50);
        cbx3.setFont(f);
        cbx3.setForeground(Color.BLUE);
        cbx3.setBackground(Color.CYAN);
        c.add(cbx3);
        
        grp.add(cbx1);
        grp.add(cbx2);
        grp.add(cbx3);
        
        lbl = new JLabel("You haven't selected anything.");
        lbl.setBounds(50,280,300,50);
        lbl.setForeground(Color.BLUE);
        lbl.setFont(f);
        c.add(lbl);
        
        /*Handeler hd = new Handeler();
        cbx1.addActionListener(hd);        
        cbx2.addActionListener(hd);        
        cbx3.addActionListener(hd); */  
        
        Handeler hd = new Handeler();
        cbx1.addItemListener(hd);        
        cbx2.addItemListener(hd);        
        cbx3.addItemListener(hd);
    }
    /*class Handeler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(cbx1.isSelected())
            {
                lbl.setText("You have selected Nafisa.");
            }    
            else if(cbx2.isSelected())
                {
                        lbl.setText("You have selected Anjum.");
                    }
            else{
                lbl.setText("You have selected Dana. ");
            }
                    
        }
        
    }*/
    
    class Handeler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(cbx1.isSelected()){
                lbl.setText("you have selected Nafisa.");
            }
            else if (cbx2.isSelected()){
                lbl.setText("You have selected Anjum. ");
            }
            else{
                lbl.setText("You have selected Dana. ");
            }
        }
        
    }
    
    

    
    public static void main(String[] args) {
        JCheckBoxDemo jx = new JCheckBoxDemo();
        jx.setVisible(true);
    }
    
}
