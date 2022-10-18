package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String HOST = "jdbc:mysql://localhost:3306/java";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "O0v1T_GUE";
    private static SessionFactory sessionFactory = null;

    public static SessionFactory getConnection() {
        try {
            Configuration configuration = new Configuration()
                    .setProperty("hibernate.connection.driver_class", DRIVER)
                    .setProperty("hibernate.connection.url", HOST)
                    .setProperty("hibernate.connection.username", LOGIN)
                    .setProperty("hibernate.connection.password", PASSWORD)
                    .addAnnotatedClass(User.class);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




    //реализация JDBC
//    private static Connection connection = null;
//    private static Util instance = null;
//
//    public Util() {
//        try {
//            if (connection == null || connection.isClosed()) {
//                connection = DriverManager.getConnection(HOST, LOGIN, PASSWORD);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static Util getInstance() {
//        if (instance == null) {
//            instance = new Util();
//        }
//        return instance;
//    }
//
//
//
//    public Connection getConnection() {
//        return connection;
//    }
}
