package JFRAME;
import java.sql.*;
public class DBCon {
    static Connection con= null;
    public static Connection getConnection()
    {
        try
        {
            Class.forName("con.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/library", "root", "root1234");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
