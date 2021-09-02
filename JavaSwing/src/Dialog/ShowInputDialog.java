
package Dialog;

import javax.swing.JOptionPane;

public class ShowInputDialog {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog(null,"Enter your first  name :","Take Input 1",JOptionPane.QUESTION_MESSAGE);
        String name2 = JOptionPane.showInputDialog(null,"Enter your last  name :","Take Input 2",JOptionPane.INFORMATION_MESSAGE);
        String f_name = name1 + "  " +name2;
        JOptionPane.showMessageDialog(null,"Your full name is :"+ f_name,"Final Output",JOptionPane.WARNING_MESSAGE );
    }
    
}
