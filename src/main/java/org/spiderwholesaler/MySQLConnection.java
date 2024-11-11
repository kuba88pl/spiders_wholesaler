package org.spiderwholesaler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public static void main(String[] args) {

        String url = "jdbc:myslq://localhost:3306/wholesaler";
        String user = "root";
        String passwoerd = "Proxymin3_0451$";

        try {
            Connection connection = DriverManager.getConnection(url, user, passwoerd);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
