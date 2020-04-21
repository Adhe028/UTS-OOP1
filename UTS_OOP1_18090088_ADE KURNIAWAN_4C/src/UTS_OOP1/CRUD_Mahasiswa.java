/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_OOP1;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adhe
 */
public class CRUD_Mahasiswa {
    public static void main(String args[]) {
        CRUD_Mahasiswa app = new CRUD_Mahasiswa();
        Scanner sc = new Scanner(System.in);
        while(true) {
            app.printMenu();
            int pilihan = sc.nextInt();
            switch(pilihan) {
                case 1: 
                    System.out.println("Formulir Tambah Data");
                    app.tambahData();
                    break;
                case 2:
                    System.out.println("Formulir Ubah Data");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("Formulir Hapus Data");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("Daftar Data");
                    app.listData();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Urutan data yang akan dihapus : "); int idx = Integer.parseInt(sc.nextLine());
        // proses hapus data
        Operasi.HapusData(idx-1);
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Urutan data yang akan diubah : "); int idx = Integer.parseInt(sc.nextLine());
        System.out.println("---------------------------------");
        System.out.print("Nama : "); String nama = sc.nextLine();
        System.out.print("NIM : "); String nim = sc.nextLine();
        System.out.print("Kelas : "); String kelas = sc.nextLine();
        System.out.print("Prodi : "); String prodi = sc.nextLine();
        // proses ubah data
        Operasi.UbahData(new Data(nama, nim, kelas, prodi), idx-1);
    }

    public void listData() {
        // proses tampilkan data
        List<Data> result = Operasi.getListData();
        for(int i=0; i<result.size(); i++) {
            System.out.println();
            System.out.println("Data ke-" + (i+1));
            System.out.println("  Nama : " + result.get(i).getNama());
            System.out.println("  NIM : " + result.get(i).getNim());
            System.out.println("  Kelas : " + result.get(i).getKelas());
            System.out.println("  Prodi : " + result.get(i).getProdi());
        }
    }

    public void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Nama : "); String nama = sc.nextLine();
        System.out.print("NIM : "); String nim = sc.nextLine();
        System.out.print("Kelas : "); String kelas = sc.nextLine();
        System.out.print("Prodi : "); String prodi = sc.nextLine();
        // proses tambah data
        Operasi.TambahData(new Data(nama, nim, kelas, prodi));
    }

    public void printMenu() {
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("        Aplikasi Console        ");
        System.out.println("    Perekaman Data Mahasiswa    ");
        System.out.println("================================");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }

}


