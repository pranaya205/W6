import java .sql.*;
class EDelete
{
public static void main(String a[ ])
{
Connection c;
try
{  
Class .forName("sun.Jdbc.odbcJdbcOdbcDriver");
c=DriverManager.getConnection("jdbc:odbc:dsn6");
PrepaaredStatement  ps=c.prepareStatement("Delete*from Employee where EID=?");
ps.setInt(1,Integer.parseInt(a[0]));
int k=ps.executeUpadate(" ");
if(k>0)
System.out.println("Record Successfully Deleted");
c.close( );
} catch(Exception e)
{
Sysetm.out.println(e);
}
}
}