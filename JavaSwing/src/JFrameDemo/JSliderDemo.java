
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;


public class JSliderDemo extends JFrame{
    private Container c;
    private JSlider js;
    
    JSliderDemo()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        js = new JSlider(/*JSlider.VERTICAL,*/0,20,0);
        js.setBounds(50,100,400,100);
        js.setBackground(Color.ORANGE);
        js.setMinorTickSpacing(1);
        js.setMajorTickSpacing(5);
        js.setPaintTicks(true);
        js.setPaintLabels(true);
        c.add(js);
    }
    
    public static void main(String[] args) {
        JSliderDemo  js = new JSliderDemo();
        js.setVisible(true);
        js.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        js.setBounds(100,100,600,500);
        js.setTitle("JSlider demo");
    }
    
}
