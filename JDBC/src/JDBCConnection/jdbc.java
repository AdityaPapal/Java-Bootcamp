package JDBCConnection;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc {

    public static void main(String[] args) throws  Exception {

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String user = "postgres";
        String pass ="Aditya2003";

        Connection con = DriverManager.getConnection(url, user,pass);




    }
}
