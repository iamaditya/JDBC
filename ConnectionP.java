import java.sql.*;
public class ConnectionP {



    static Connection con;
    public static Connection createC() throws ClassNotFoundException, SQLException {
        String url, user, password;

        user = "postgres";
        url = "jdbc:postgresql://localhost/TestDB";
        password = "root";


        Class.forName("org.postgresql.Driver");

        con = DriverManager.getConnection(url,user,password);

        return con;
    }
}
