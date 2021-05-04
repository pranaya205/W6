import java.awt.*;
import java.awt.event.*;
import java.sql.*;
Class SFrame extends Frame implements ActionListener
{
Label l1,l2,l3;TextField tf1,tf2,tf3;Button b1,b2;
Connection c;PreparedStatement ps;
SFrame( )
{
l1=new Label("Enter Regno:");
l2=new Label("Name:");
l3=new Label("Course");
tf1=new TextField( );
tf2=new TextField( );
tf3=new TextField( );
b1=new Button("search");
b2=new Button("clear");
set Layout(new GridLayout(4,2));
add(l1);add(tf1);
add(l2);add(tf2);
add(l3);add(tf3);
add(b1);add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
addWindowListener(new WindowAdapter( )
{
public void windowClosing(WindowEvent we)
{
dispose( );
}});
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
c=DriverManager.getconnection("jdbc:odbc:dsn1");
ps=c.preparedstatement("select*from student where regno=?");
}catch(Exception e)
{
System.out.println(e);
}
}
public void actionperformed(ActionEvent ae)
{
try{
String s=ae.getActionCommand( );
if(s.equals("Search"))
{
ps.setInt(1,Integer.parseInt(tf1.getText( )));
ResultSet rs =ps.executeQuery( );
if(rs.next( ))
{
tf2.setText(rs.getString(2));
tf3.setText(rs.getString(3));
}
}
else
{
tf1.setText(" ");tf2.setText(" ");tf3.setText(" ");
}}catch(Exception e) { }
{System.out.println(e);}
}
public static void main (String a[ ])
{
SFrame sf=new SFrame( );
sf.setVisible(true);
sf.setSize(300,300);
}
}
