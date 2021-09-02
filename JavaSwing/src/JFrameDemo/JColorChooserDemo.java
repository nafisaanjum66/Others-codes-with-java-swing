
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;


public class JColorChooserDemo extends JFrame{
    
    private Container c;
    private JButton btn;
    
     JColorChooserDemo()
     {
         initComponents();
     }
     
     public void initComponents()
     {
         c = this.getContentPane();
         c.setLayout(null);
         
         btn = new JButton("Choose a Color");
         btn.setBounds(100,50,150,50);
         c.add(btn);
         
         btn.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e) {
                 
                 Color color = JColorChooser.showDialog(null, "Select Color", Color.yellow);
                 c.setBackground(color);
                 
             }
         
         });
     }

    
    public static void main(String[] args) {
        JColorChooserDemo cc = new JColorChooserDemo ();
        cc.setVisible(true);
        cc.setBounds(100,100,500,600);
        cc.setTitle("Color Chooser");

    }
    
}
