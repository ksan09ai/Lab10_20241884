package com.example.lab10_20241884.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DaoBase {
    protected Connection getConnection() {

        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/veterinaria";
            String user = "root";
            String password = "12345678";

            conexion = DriverManager.getConnection(url, user, password);
        } catch (SQLException e){
            System.out.println("Error al conectar con la base de datos" + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return conexion;
    }
}
