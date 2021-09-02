
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class JTableDemo extends JFrame {
    private Container c;
    private JTable tbl;
    private JScrollPane sc;
    private JLabel lbl;
    private Font f;
    
    private String[] col = {"Name","ID","Depertment"};
    private String[][] row = {
        {"Nafisa","18-38091-2","CSE"},
        {"Shefat","18-36389-1","CSE"},
        {"Anjum","18-216568-1","CSE"},
        {"Dana","18-51498-1","CSE"},
        {"Nafisa","18-38091-2","CSE"},
        {"Shefat","18-36389-1","CSE"},
        {"Anjum","18-216568-1","CSE"},
        {"Dana","18-51498-1","CSE"},
        {"Nafisa","18-38091-2","CSE"},
        {"Shefat","18-36389-1","CSE"},
        {"Anjum","18-216568-1","CSE"},
        {"Dana","18-51498-1","CSE"},
    
    };
    
    JTableDemo()
    {
        initComponents();  
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f = new Font("Callibri",Font.BOLD,22);
        
        lbl = new JLabel("Student Table");
        lbl.setBounds(350,20,150,50);
        lbl.setFont(f);
        c.add(lbl);
        
        tbl = new JTable(row,col);
        tbl.setSelectionBackground(Color.CYAN);
        //tbl.setEnabled(false);
        
        
        
        sc = new JScrollPane(tbl);
        sc.setBounds(50,90,800,200);
        c.add(sc);
        
    }
    
    
    public static void main(String[] args) {
        JTableDemo tb = new JTableDemo();
        tb.setVisible(true);
        tb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tb.setBounds(100,100,900,500);
        tb.setTitle("Table");
    }
    
}
