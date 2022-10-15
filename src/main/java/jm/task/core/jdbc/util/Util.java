package jm.task.core.jdbc.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection connection = null;
    private static Util instance = null;

    public Util() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/java",
                        "root",
                        "O0v1T_GUE");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Util getInstance() {
        if (instance == null) {
            instance = new Util();
        }
        return instance;
    }



    public Connection getConnection() {
        return connection;
    }
}
