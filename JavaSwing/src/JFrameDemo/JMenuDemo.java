

package JFrameDemo;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

 
public class JMenuDemo extends JFrame implements ActionListener {
    private Container c;
    private JMenu file,edit,help;
    private JMenuBar mbar;
    private JMenuItem newitem,openitem,copyitem,pasteitem,selectAllitem,exititem,cutitem;
    private ImageIcon cuticon,newicon;
    
    JMenuDemo()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        
        cuticon = new ImageIcon("src/image/cut.png");
        newicon = new ImageIcon("src/image/new.png");
        
        mbar = new JMenuBar();
        this.setJMenuBar(mbar);
        
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        
        mbar.add(file);
        mbar.add(edit);
        mbar.add(help);
        
        newitem = new JMenuItem("New");
        newitem.setIcon(newicon);
        
        newitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        
        
        openitem = new JMenuItem("Open");
        cutitem = new JMenuItem("Cut");
        cutitem.setIcon(cuticon);
        copyitem = new JMenuItem("Copy");
        pasteitem = new JMenuItem("Paste");
        selectAllitem = new JMenuItem("Select All");
        exititem = new JMenuItem("exit");
        
        file.add(newitem);
        file.add(openitem);
        file.add(exititem);
        
        edit.add(copyitem);
        edit.addSeparator();
        edit.add(cutitem);
        edit.add(pasteitem);
        edit.add(selectAllitem); 
        
        newitem.addActionListener(this);
        exititem.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==newitem)
        {
            JFrame fr = new JFrame();
            fr.setVisible(true);
            fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fr.setBounds(1500,100,700,800);
            fr.setTitle("New Frame");
        }
        else if(e.getSource()==exititem)
        {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        JMenuDemo mn = new JMenuDemo();
        mn.setVisible(true);
        mn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mn.setBounds(900,100,700,800);
        mn.setTitle("Menu Demo");
        mn.setResizable(true);
    }

    
    
}
