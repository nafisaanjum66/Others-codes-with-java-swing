
package ListenerDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class KeyListenerDemo  extends JFrame{
    
    private Container c;
    private JTextField tf;
    private JTextArea ta;
    
    KeyListenerDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,600);
        this.setTitle("Key Listener Demo");
        this.setResizable(true);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        tf = new JTextField();
        tf.setBounds(100,50,150,50);
        c.add(tf);
        
        ta = new JTextArea();
        ta.setBounds(100,110,300,250);
        c.add(ta);
        
        tf.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke) {
                
                ta.append("key typed :"+ke.getKeyChar()+"\n");

            }

            @Override
            public void keyPressed(KeyEvent ke) {
                ta.append("key pressed :"+ke.getKeyChar()+"\n");

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                ta.append("key released :"+ke.getKeyChar()+"\n");


            }
        
        
        
        });
    }
    
    public static void main(String[] args) {
        KeyListenerDemo key = new KeyListenerDemo();
        key.setVisible(true);
        
        
    }
    
    
    
}
