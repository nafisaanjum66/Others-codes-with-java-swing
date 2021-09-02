

package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class JTappedPaneDemo extends JFrame {
    private Container c;
    private JTabbedPane tp;
    private JPanel jp1,jp2,jp3;
    private JLabel lbl1,lbl2,lbl3;
    private ImageIcon icon;
    
    
    JTappedPaneDemo()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        
        tp = new JTabbedPane(/*JTabbedPane.BOTTOM*/);
        //tp.setTabPlacement(JTabbedPane.BOTTOM);
        tp.setBounds(100,100,400,400);
        c.add(tp);
        
        //icon = new ImageIcon("src/image/1.jpg");
        
        lbl1 = new JLabel("this is label one");
        lbl2 = new JLabel("this is label two");
        lbl3 = new JLabel("this is label three");
        
        jp1 = new JPanel();
        jp1.setBackground(Color.BLUE);
        jp1.add(lbl1);
        
        jp2 = new JPanel();
        jp2.setBackground(Color.RED);
        jp2.add(lbl2);
        
        jp3 = new JPanel();
        jp3.setBackground(Color.CYAN);
        jp3.add(lbl3);
        
        tp.addTab("Nafisa"/*,icon*/,jp1);
        tp.addTab("Anjum",icon,jp2,"anjum text");
        tp.addTab("Dana",jp3);
    }
    
    public static void main(String[] args) {
        JTappedPaneDemo jt = new JTappedPaneDemo();
        jt.setVisible(true);
        jt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jt.setBounds(100,100,600,700);
        jt.setTitle("Tapped Pane");
    }
    
}
