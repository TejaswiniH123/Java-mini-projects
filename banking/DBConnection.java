package banking;

import java.sql.DriverManager;

public class DBConnection {
    static java.sql.Connection con;

    public static java.sql.Connection getConnection() {
        try {
            String mysqlJDBCDriver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/BANK";
            String user = "root";
            String pass = "Teju8217@";

            Class.forName(mysqlJDBCDriver);
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Connection Failed! " + e.getMessage());
        }
        return con;
    }
}
