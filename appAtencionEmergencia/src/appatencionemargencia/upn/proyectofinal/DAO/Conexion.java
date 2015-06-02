/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appatencionemargencia.upn.proyectofinal.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Eduard Marquez
 */
public class Conexion {
    private static String user = "system";
    private static String password = "123456";
    private static String server = "127.0.0.1";
    private static String port = "1521";
    private static String dbname = "BDSAMU";

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@" + server + ":" + port + ":" + dbname,
                    user,
                    password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
