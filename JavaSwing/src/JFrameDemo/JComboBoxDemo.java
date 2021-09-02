
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxDemo extends JFrame{
    private Container c;
    private JComboBox cb;
    private Font f;
    private String[] name={"Nafisa","Anjum","Dana"};
    private JButton btn;
    private Cursor cr;
    private JLabel lbl;
    
    JComboBoxDemo(){
        initComponents();
    }
    
    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        f = new Font("Callibri",Font.BOLD,18);
        
        cb = new JComboBox(name);
        cb.setBackground(Color.GREEN);
        cb.setFont(f);
        cb.setBounds(100,50,150,50);
        cb.setEditable(true);
        cb.addItem("Shawlina");
        cb.addItem("Nawshin");
        cb.addItem("Purba");
        //cb.setSelectedIndex(3);
        cb.setSelectedItem("Purba");
        //cb.removeItem("Purba");
        //cb.removeItemAt(2);
        c.add(cb);
        //cb.removeAllItems();
        
        //System.out.println("Total names ="+cb.getItemCount());
        
        cr = new Cursor(Cursor.HAND_CURSOR);
        
        btn = new JButton("Show");
        btn.setBounds(260,50,100,50);
        btn.setCursor(cr);
        btn.setFont(f);
        c.add(btn);
        
        lbl = new JLabel();
        lbl.setBounds(50,120,300,300);
        lbl.setFont(f);
        lbl.setOpaque(true);
        lbl.setBackground(Color.GREEN);
        c.add(lbl);
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                String s = cb.getSelectedItem().toString();
                lbl.setText("You have selected "+s);
            }
        
        
        
        });
        
    }
    
    public static void main(String[] args) {
        JComboBoxDemo jc = new JComboBoxDemo();
        jc.setVisible(true);
        jc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jc.setBounds(100,100,500,600);
        jc.setTitle("Combo box demo");
        jc.setResizable(true);
    }
    
}
