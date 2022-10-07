package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbMenager {
    private Connection conn;                                 // [1]
    private static DbMenager dbManagerInstance;              // [2]

    private DbMenager() throws SQLException {                // [3]
        Properties connectionProps = new Properties();        // [4]
        connectionProps.put("user", "kodilla");          // [5]
        connectionProps.put("password", "kodilla");  // [6]
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodilla_tester?serverTimezone=Europe/Warsaw"
                        + "&useSSL=False",
                connectionProps);             // [7]
    }                                                       // [8]

    public static DbMenager getInstance() throws SQLException {  // [9]
        if (dbManagerInstance == null) {                          // [10]
            dbManagerInstance = new DbMenager();                   // [11]
        }                                                         // [12]
        return dbManagerInstance;                                 // [13]
    }                                                           // [14]

    public Connection getConnection() {                          // [15]
        return conn;                                             // [16]
    }                                                            // [17]
}