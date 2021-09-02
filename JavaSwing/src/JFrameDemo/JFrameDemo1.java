
package JFrameDemo;

import javax.swing.JFrame;


public class JFrameDemo1 {
    
    public static void main(String[] args) {
        JFrame jf = new JFrame();
    
         jf.setVisible(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         //jf.setSize(400,300);
         //jf.setLocationRelativeTo(null);
         //jf.setLocation(400,400);
         jf.setBounds(400,400,400,300);
         jf.setTitle("PURBA");
         jf.setResizable(false);
         
    
    }
    
    
}
