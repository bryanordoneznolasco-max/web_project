package org.example;


    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class conection {
        private static final String URL = "jdbc:mysql://localhost:3306/mi_pagina";
        private static final String USUARIO = "app_web";
        private static final String PASSWORD = "tacodepollo";

        public static Connection obtener() throws SQLException {
            return DriverManager.getConnection(URL, USUARIO, PASSWORD);
        }
    }

