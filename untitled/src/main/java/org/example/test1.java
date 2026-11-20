package org.example;
import java.sql.*;

public class test1 {


        public static void main(String[] args) {
            String sql = "SELECT p.nombre, p.precio, c.nombre AS categoria " +
                    "FROM productos p JOIN categorias c ON c.id = p.categoria_id";

            try (Connection con = conection.obtener();
                 PreparedStatement ps = con.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {

                System.out.println("Conexión exitosa");
                while (rs.next()) {
                    System.out.println(rs.getString("nombre") + " - $" +
                            rs.getBigDecimal("precio") + " - " +
                            rs.getString("categoria"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

