import java .sql.*;
class EInsert
{
public static void main(String a[ ])
{
Connection c;
try
{  
Class .forName("sun.Jdbc.odbcJdbcOdbcDriver");
c=DriverManager.getConnection("jdbc:odbc:dsn6");
PrepaaredStatement  ps=c.prepareStatement("insert into Employee values(?,?,?)");
ps.setInt(1,Integer.parseInt(a[0]));
ps.setString(2,a[1]);
ps.setString(2a[2]);
int k=ps.executeUpadate(" ");
if(k>0)
System.out.println("Record Successfully Inserted");
c.close( );
} catch(Exception e)
{
System.out.println(e);
}
}
}