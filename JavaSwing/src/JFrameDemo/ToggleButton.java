
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;


public class ToggleButton extends JFrame implements ActionListener{
    private Container c;
    private JToggleButton tb;
    private JLabel lbl;
    private ImageIcon img1,img2;
    
    ToggleButton()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        img1 = new ImageIcon(getClass().getResource("diamond.png"));
        img2 = new ImageIcon(getClass().getResource("panda.png"));
        
        
        tb = new JToggleButton(img1);
        tb.setBounds(50,10,100,100);
        c.add(tb);
        
        lbl = new JLabel("I love YOU");
        lbl.setVisible(false);
        lbl.setBounds(50,130,150,50);
        c.add(lbl);
        
        tb.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(tb.isSelected()){
            //tb.setText("ON");
            tb.setIcon(img1);
            lbl.setVisible(true);
        }
        else{
            //tb.setText("OFF");
            tb.setIcon(img2);
            lbl.setVisible(false);
        }
    }
    
    
    public static void main(String[] args) {
        ToggleButton tg = new ToggleButton();
        tg.setVisible(true);
        tg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tg.setBounds(100,100,400,300);
        tg.setTitle("Toggle Button");

    }

    
    
}
