import java.awt.*;
import java.awt.event.*;
class MenuFrame extends Frame
implements ActionListener,ItemListener,WindowListener
{
TextArea ta;
MenuFrame(String title)
{
super(title);
ta=new TextArea(10,20);
add(ta);
addWindowListener(this);
MenuBar mb=new MenuBar( );
setMenuBar(mb);
Menu a=new Menu("A");
mb.add(a);
MenuItem a1=new MenuItem("A1");
a1.addActionListener(this);
a.add(a1);
MenuItem a2=new MenuItem("A2");
a2.addActionListener(this);
a.add(a2);
MenuItem a3=new MenuItem("A3");
a3.addActionListener(this);
a.add(a3);
Menu b=new Menu("B");
mb.add(b);
MenuItem b1=new MenuItem("B1");
b1.addActionListener(this);
b.add(b1);
MenuItem b2=new MenuItem("B2");
b2.addActionListener(this);
b.add(b2);
Menu b3=new Menu("B3");
mb.add(b3);
MenuItem b31=new MenuItem("B31");
b31.addActionListener(this);
b3.add(b3);
MenuItem b32=new MenuItem("B32");
b32.addActionListener(this);
b.add(b32);
Menu c=new Menu("C");
mb.add(c);
MenuItem c1=new MenuItem("C1");
c1.addActionListener(this);
c.add(c1);
MenuItem c2=new MenuItem("C2");
c2.addActionListener(this);
c.add(c2);
Menu d=new Menu("D");
mb.add(d);
CheckboxMenuItem d1=new CheckboxMenuItem("D1");
d1.addItemListener(this);
d.add(d1);
CheckboxMenuItem d2=new CheckboxMenuItem("D2");
d2.addItemListener(this);
d.add(d2);
}
public void actionPerformed(ActionEvent ae)
{
ta.append("ActionEvents:"+ae.getActionCommand( ) + "/n");
}
public void itemStateChanged(ItemEvent ie)
{
CheckboxMenuItem cbmi=(CheckboxMenuItem)ie.getSource( );
ta.append("ItemEvent:"+cbmi.getLabel( )+ "/n");
}
public void windowActivated(WindowEvent we)
{
}
public void windowDeactivated(WindowEvent we)
{
}
public void windowClosing(WindowEvent we)
{
dispose( );
}
public void windowClosed(WindowEvent we)
{
}
public void windowIconified(WindowEvent we)
{
}
public void windowDeiconified(WindowEvent we)
{
}
public void windowOpened(WindowEvent we)
{
}
}
public class FMenuItemEvent
{
public  static void main (String arg[ ])
{
MenuFrame mf=new MenuFrame("MyFrame");
mf.setVisible(true);
mf.setSize(300,300);
}
}
































