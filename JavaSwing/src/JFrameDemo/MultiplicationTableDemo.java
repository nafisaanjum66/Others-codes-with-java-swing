
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MultiplicationTableDemo extends JFrame{
    
    private Container c;
    private ImageIcon img,icon;
    private JLabel imglbl,lbl;
    private Font f;
    private JTextField tf;
    private JTextArea ta;
    private JButton btn1;
    
    MultiplicationTableDemo(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        icon = new ImageIcon(getClass().getResource("mulicon.png"));
        this.setIconImage(icon.getImage());
        
        
        f = new Font("Georgia",Font.BOLD,18);
        
        img = new ImageIcon(getClass().getResource("mltable.png"));
        
        imglbl = new JLabel(img);
        imglbl.setBounds(40,20,400,250);
        c.add(imglbl);
        
        lbl = new JLabel();
        lbl.setText("Enter any number here :");
        lbl.setBounds(40,290,250,50);
        lbl.setFont(f);
        c.add(lbl);
        
        tf = new JTextField();
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBounds(300,290,140,50);
        tf.setBackground(Color.PINK);
        tf.setFont(f);
        c.add(tf);
        
        btn1 = new JButton("CLEAR");
        btn1.setFont(f);
        btn1.setBounds(300,350,140,50);
        btn1.setForeground(Color.RED);
        c.add(btn1);
        
        ta = new JTextArea();
        ta.setBounds(40,410,400,460);
        ta.setBackground(Color.PINK);
        ta.setFont(f);
        c.add(ta);
        
        tf.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String val = tf.getText();
                
                if(val.isEmpty()){
                    JOptionPane.showMessageDialog(null,"You didn't enter anything.","Error",1);
                }
                else{
                int num = Integer.parseInt(tf.getText());
                ta.setText("");
                
                for (int i = 0; i <= 10; i++) {
                    int result = num * i;
                    
                    String r = String.valueOf(result);
                    String n = String.valueOf(num);
                    String incr = String.valueOf(i);
                    
                    ta.append(n + " X " +incr+" = "+r+"\n");
                    
                }
                }
                
                
            }
        
        
        
        });
        
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                ta.setText("");
                
            }
        
        
        
        });
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        MultiplicationTableDemo ml = new MultiplicationTableDemo();
        ml.setVisible(true);
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ml.setBounds(500,50,500,950);
        ml.setTitle("Multiplication Table");
        ml.setResizable(true);
        
    }
    
}
