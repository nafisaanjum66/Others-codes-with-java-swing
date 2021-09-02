
package JFrameDemo;

import javax.swing.JFrame;

public class JFrameDemo2 extends JFrame{
    
    JFrameDemo2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,100,400,500);
        setTitle("This is title");
        setResizable(false); 
        
    }
    
    public static void main(String[] args) {
        JFrameDemo2 jf = new JFrameDemo2();
        
        jf.setVisible(true);
    }
    
}
