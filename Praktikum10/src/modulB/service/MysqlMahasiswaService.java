/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulB.service;

/**
 *
 * @author Izzat Fauzan
 */

import modulB.model.Mahasiswa;
import modulB.utilities.MysqlUtility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MysqlMahasiswaService {

    Connection koneksi;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    public void add(Mahasiswa mhs) {
        try {
            Statement st = koneksi.createStatement();

            String sql = "INSERT INTO mahasiswa VALUES (" +
                    mhs.getId() + ", '" + mhs.getNama() + "')";

            st.executeUpdate(sql);
            System.out.println("Berhasil insert");
        } catch (Exception e) {
            System.out.println("Gagal insert: " + e.getMessage());
        }
    }

    public void update(Mahasiswa mhs) {
        try {
            Statement st = koneksi.createStatement();

            String sql = "UPDATE mahasiswa SET nama='" +
                    mhs.getNama() + "' WHERE id=" + mhs.getId();

            st.executeUpdate(sql);
            System.out.println("Berhasil update");
        } catch (Exception e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }

    public void delete(int id) {
        try {
            Statement st = koneksi.createStatement();

            String sql = "DELETE FROM mahasiswa WHERE id=" + id;

            st.executeUpdate(sql);
            System.out.println("Berhasil delete");
        } catch (Exception e) {
            System.out.println("Gagal delete: " + e.getMessage());
        }
    }

    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;

        try {
            Statement st = koneksi.createStatement();

            String sql = "SELECT * FROM mahasiswa WHERE id=" + id;

            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                mhs = new Mahasiswa(
                        rs.getInt("id"),
                        rs.getString("nama")
                );
            }
        } catch (Exception e) {
            System.out.println("Gagal getById: " + e.getMessage());
        }

        return mhs;
    }

    public ArrayList<Mahasiswa> getAll() {
        ArrayList<Mahasiswa> list = new ArrayList<>();

        try {
            Statement st = koneksi.createStatement();

            String sql = "SELECT * FROM mahasiswa";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa(
                        rs.getInt("id"),
                        rs.getString("nama")
                );

                list.add(mhs);
            }
        } catch (Exception e) {
            System.out.println("Gagal getAll: " + e.getMessage());
        }

        return list;
    }
}