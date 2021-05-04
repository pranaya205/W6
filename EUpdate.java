import java .sql.*;
class EUpdate
{
public static void main(String a[ ])
{
Connection c;
try
{  
Class .forName("sun.Jdbc.odbcJdbcOdbcDriver");
c=DriverManager.getConnection("jdbc:odbc:dsn6");
PrepaaredStatement  ps=c.prepareStatement("Update  Employee set EName= ?,Design=?,where EID=?");
ps.setInt(3,Integer.parseInt(a[0]));
ps.setString(2,a[1]);
ps.setString(2a[2]);
int k=ps.executeUpadate(" ");
if(k>0)
System.out.println("Record Successfully updated");
c.close( );
} catch(Exception e)
{
Sysetm.out.println(e);
}
}
}