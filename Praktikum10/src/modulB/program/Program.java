/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulB.program;

/**
 *
 * @author Izzat Fauzan
 */

import modulB.model.Mahasiswa;
import modulB.service.MysqlMahasiswaService;

import java.util.ArrayList;

public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {

        System.out.println("=== Data awal");
        displayAll();

        System.out.println("\n=== Insert");
        Mahasiswa mhsBaru = new Mahasiswa(5, "Haryo");
        service.add(mhsBaru);
        displayAll();

        System.out.println("\n=== Update");
        Mahasiswa mhsUpdate = service.getById(5);
        mhsUpdate.setNama("Dinaya");
        service.update(mhsUpdate);
        displayAll();

        System.out.println("\n=== Delete");
        service.delete(5);
        displayAll();
    }

    static void displayAll() {
        ArrayList<Mahasiswa> list = service.getAll();

        for (Mahasiswa mhs : list) {
            System.out.println(mhs);
        }
    }
}