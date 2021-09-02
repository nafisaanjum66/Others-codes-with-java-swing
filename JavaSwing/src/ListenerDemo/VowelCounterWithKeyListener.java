
package ListenerDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VowelCounterWithKeyListener extends JFrame {
    private Container c;
    private JTextArea ta;
    private JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7;
    private JScrollPane sc;
    private Font f;
    
    int totalv = 0;
    int ltra=0;
    int ltre=0;
    int ltri=0;
    int ltro=0;
    int ltru=0;
    
    
    VowelCounterWithKeyListener(){
        initComponents();
    }
    
    public void initComponents(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,600,700);
        this.setTitle("Vowel Counter App");
        this.setResizable(true);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        f = new Font("Callibri",Font.BOLD,18);
        
        lbl1 = new JLabel ("Enter your Text :");
        lbl1.setBounds(10,30,150,50);
        lbl1.setFont(f);
        c.add(lbl1);
        
        ta = new JTextArea();
        ta.setFont(f);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        
        sc = new JScrollPane(ta);
        sc.setBounds(170,10,400,150);
        c.add(sc);
        
        lbl2 = new JLabel("Total number of vowel :");
        lbl2.setBounds(170,180,300,50);
        lbl2.setFont(f);
        c.add(lbl2);
        
        lbl3 = new JLabel("Number of A :");
        lbl3.setBounds(170,240,300,50);
        lbl3.setFont(f);
        c.add(lbl3);
        
        lbl4 = new JLabel("Number of E :");
        lbl4.setBounds(170,300,300,50);
        lbl4.setFont(f);
        c.add(lbl4);
        
        lbl5 = new JLabel("Number of I :");
        lbl5.setBounds(170,360,300,50);
        lbl5.setFont(f);
        c.add(lbl5);
       
        lbl6 = new JLabel("Number of O :");
        lbl6.setBounds(170,420,300,50);
        lbl6.setFont(f);
        c.add(lbl6);
       
        lbl7 = new JLabel("Number of U :");
        lbl7.setBounds(170,480 ,300,50);
        lbl7.setFont(f);
        c.add(lbl7);
        
        ta.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
                if(ke.getSource()==ta)
                {
                    if(ke.VK_A==ke.getKeyCode())
                    {
                        ltra++;
                        totalv++;
                    }
                    if(ke.VK_E == ke.getKeyCode())
                    {
                        ltre++;
                        totalv++;
                    }
                    if(ke.VK_I == ke.getKeyCode())
                    {
                        ltri++;
                        totalv++;
                    }
                    if(ke.VK_O == ke.getKeyCode())
                    {
                        ltro++;
                        totalv++;
                    }
                    if(ke.VK_U == ke.getKeyCode())
                    {
                        ltru++;
                        totalv++;
                    }
                    
                }
                lbl2.setText("Total number of Vowel :"+totalv);
                lbl3.setText("Total number of A :"+ltra);
                lbl4.setText("Total number of E :"+ltre);
                lbl5.setText("Total number of I :"+ltri);
                lbl6.setText("Total number of O :"+ltro);
                lbl7.setText("Total number of U :"+ltru);
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }
        
        
        
        });
       
    }
    
    
    public static void main(String[] args) {
        VowelCounterWithKeyListener vc = new VowelCounterWithKeyListener();
        vc.setVisible(true);
    }
    
}
