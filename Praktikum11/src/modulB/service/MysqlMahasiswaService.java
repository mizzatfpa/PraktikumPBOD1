package modulB.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modulB.model.Mahasiswa;
import modulB.utilities.MysqlUtility;

public class MysqlMahasiswaService {

    public boolean add(Mahasiswa mhs) throws SQLException {
        String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (Connection koneksi = MysqlUtility.getConnection();
                PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean add(String nama) throws SQLException {
        return add(new Mahasiswa(getNextId(), nama));
    }

    public boolean update(Mahasiswa mhs) throws SQLException {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (Connection koneksi = MysqlUtility.getConnection();
                PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean delete(int id) throws SQLException {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try (Connection koneksi = MysqlUtility.getConnection();
                PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    public Mahasiswa getById(int id) throws SQLException {
        String sql = "SELECT id, nama FROM mahasiswa WHERE id = ?";
        try (Connection koneksi = MysqlUtility.getConnection();
                PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
                }
            }
        }
        return null;
    }

    public List<Mahasiswa> getAll() throws SQLException {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT id, nama FROM mahasiswa ORDER BY id";
        try (Connection koneksi = MysqlUtility.getConnection();
                Statement st = koneksi.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
            }
        }
        return list;
    }

    private int getNextId() throws SQLException {
        String sql = "SELECT COALESCE(MAX(id), 0) + 1 AS id FROM mahasiswa";
        try (Connection koneksi = MysqlUtility.getConnection();
                Statement st = koneksi.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getInt("id");
            }
        }
        return 1;
    }
}
