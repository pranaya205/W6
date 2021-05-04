import java.sql.*;
class EDisplay
{
public static void main(String a[ ])
{
Connection c;
try
{  
Class .forName("sun.Jdbc.odbcJdbcOdbcDriver");
c=DriverManager.getConnection("jdbc:odbc:dsn6");
Statement s=c.createStatement( );
ResultSet rs=s.executeQuery("select * from Employee");
while(rs.next( ))
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
c.close( );
} catch(Exception e)
{
System.out.println(e);
}
}
}