package persistence.connectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {
    static Connection connection = null;

    public static Connection openConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Credentials
            String URL = "jdbc:mysql://localhost:3306/RiwiAcademyDB";
            String user = "root";
            String password = "Rlwl2023.";

            // establishing the connection
            connection = DriverManager.getConnection(URL,user,password);
            System.out.println("Connection established");

        } catch (ClassNotFoundException error) {
            throw new RuntimeException("ERROR: Driver MySQL not found "+ error.getMessage());
        } catch (SQLException error) {
            System.out.println("ERROR: Connection failed" + error.getMessage());
        }
       return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null) connection.close();
            System.out.println("Connection closed");
        }catch (SQLException e) {
            System.out.println("ERROR: Connection not close");
        }
    }

}
