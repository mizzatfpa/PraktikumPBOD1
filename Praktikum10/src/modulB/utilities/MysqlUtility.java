/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulB.utilities;

/**
 *
 * @author Izzat Fauzan
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlUtility {

    public static Connection getConnection() {
        Connection koneksi = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            koneksi = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_mhs",
                    "root",
                    ""
            );

            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }

        return koneksi;
    }
}
