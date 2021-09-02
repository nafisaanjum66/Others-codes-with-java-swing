
package Dialog;

import javax.swing.JOptionPane;

public class ShowConfirmDialog {
    public static void main(String[] args) {
         
        int choice = JOptionPane.showConfirmDialog(null, "Do you Want To LOVE me MOREEE...????", "Love scale", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(choice == JOptionPane.YES_OPTION){
            System.exit(0); 
        }
        else{
            JOptionPane.showMessageDialog(null, "But I love you...... :-( " ,"So Sad",JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
