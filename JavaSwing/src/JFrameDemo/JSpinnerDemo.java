
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class JSpinnerDemo extends JFrame implements ChangeListener {
    private Container c;
    private JSpinner sp;
    private JLabel lbl;
    
    JSpinnerDemo()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        SpinnerNumberModel value = new SpinnerNumberModel(10,0,100,5);
        sp = new JSpinner(value);
        sp.setBounds(100,100,100,100);
        c.add(sp);
        
        lbl = new JLabel("Current value is :10");
        lbl.setBounds(100,210,150,50);
        c.add(lbl);
        
        sp.addChangeListener(this);
    }
           
    @Override
    public void stateChanged(ChangeEvent e) {
        String s = sp.getValue().toString();
        
        int a =  Integer.parseInt(s);
        
        lbl.setText("Current value is :"+a);
        
        
        
    }
    
    public static void main(String[] args) {
        JSpinnerDemo js = new JSpinnerDemo();
        js.setVisible(true);
        js.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        js.setBounds(100,100,300,400);
    }

    
    
}
