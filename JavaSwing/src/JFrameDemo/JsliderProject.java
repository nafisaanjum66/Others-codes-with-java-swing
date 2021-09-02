
package JFrameDemo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class JsliderProject extends JFrame implements ChangeListener{
    private Container c;
    private JSlider rs,gs,bs;
    private JLabel rlbl,glbl,blbl,plbl;
    private JTextField rtf,gtf,btf;
    private JPanel jp;
    
    
    JsliderProject()
    {
        initComponents();
        
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        
        rlbl = new JLabel("Red");
        rlbl.setBounds(100,100,50,50);
        c.add(rlbl);
        
        rs = new JSlider(0,255,0);
        rs.setBounds(160,100,300,50);
        c.add(rs);
        
        rtf= new JTextField();
        rtf.setBounds(470,100,100,50);
        rtf.setHorizontalAlignment(JTextField.CENTER);
        c.add(rtf);
        
        
        glbl = new JLabel("Green");
        glbl.setBounds(100,170,50,50);
        c.add(glbl);
        
        gs = new JSlider(0,255,0);
        gs.setBounds(160,170,300,50);
        c.add(gs);
        
        gtf= new JTextField();
        gtf.setBounds(470,170,100,50);
        gtf.setHorizontalAlignment(JTextField.CENTER);
        c.add(gtf);
        
        
        blbl = new JLabel("Blue");
        blbl.setBounds(100,240,50,50);
        c.add(blbl);
        
        bs = new JSlider(0,255,0);
        bs.setBounds(160,240,300,50);
        c.add(bs);
        
        btf= new JTextField();
        btf.setBounds(470,240,100,50);
        btf.setHorizontalAlignment(JTextField.CENTER);
        c.add(btf);
        
        jp = new JPanel();
        jp.setBackground(java.awt.Color.PINK);
        jp.setBounds(600,50,300,300);
        c.add(jp);
        
        plbl = new JLabel("Previews");
        plbl.setBounds(720,360,100,50);
        c.add(plbl);
        
        rs.addChangeListener(this);
        gs.addChangeListener(this);
        bs.addChangeListener(this);
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        
        int rval = rs.getValue();
        int gval = gs.getValue();
        int bval = bs.getValue();
        
        rtf.setText(""+rval);
        gtf.setText(""+gval);
        btf.setText(""+bval);
        
        Color cl = new Color(rval,gval,bval);
        jp.setBackground(cl);
        
    }
    
    public static void main(String[] args) {
        JsliderProject js = new JsliderProject();
        js.setVisible(true);
        js.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        js.setBounds(100,100,1000,480);
        js.setTitle("Color Slider");
    }

    
    
    
}
