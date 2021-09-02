
package LayoutManagerDemo;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SlideShowDemo extends JFrame implements ActionListener{
    private Container c;
    private JPanel jp;
    private JButton btn1,btn2;
    private CardLayout card;
    private ImageIcon icon;
    private JLabel lbl;
    
    SlideShowDemo(){
        initComponents();
        showImage();
        
    }
    
    public void showImage()
    {
        String[] imgname = {"1.jpg","2.jpg","3.jpg","4.jpg"};
        
        
        
        for(String n : imgname){
            icon = new ImageIcon("src/image/"+n);
            
            Image img = icon.getImage();
            Image newimg = img.getScaledInstance(jp.getWidth(), jp.getHeight(), Image.SCALE_SMOOTH);
            
            icon = new ImageIcon(newimg);
            
            lbl = new JLabel(icon);
            jp.add(lbl);
        }
        
        
    }
    
    
    
    public void initComponents()
    {
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        card = new CardLayout();
        
        jp= new JPanel(card);
        jp.setBounds(20,10,850,750);
        c.add(jp);
        
        btn1= new JButton("Previous");
        btn1.setBounds(240,790,200,60);
        c.add(btn1);
        
        btn2= new JButton("Next");
        btn2.setBounds(480,790,200,60);
        c.add(btn2); 
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1)
        {
            card.previous(jp);
        }
        else if(e.getSource()==btn2)
        {
            card.next(jp);
        }
        
        
    }
    
    
    public static void main(String[] args) {
        SlideShowDemo ss = new SlideShowDemo();
        ss.setVisible(true);
        ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ss.setBounds(100,10,900,1000);
        ss.setTitle("Slide Show");
    }

    
    
}
