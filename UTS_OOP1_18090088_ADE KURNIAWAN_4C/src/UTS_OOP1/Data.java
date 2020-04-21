/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_OOP1;

/**
 *
 * @author Adhe
 */
public class Data {
    private String nama;
    private String nim;
    private String kelas;
    private String prodi;

    public Data() {
        nama = "";
        nim = "";
        kelas = "";
        prodi = "";
    }

    public Data(String nama, String nim, String kelas, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.prodi = prodi;
    }

    

    public void setNama(String nama) { this.nama = nama; }

    public void setNim(String nim) { this.nim = nim; }

    public void setKelas(String kelas) { this.kelas = kelas; }

    public void setProdi(String prodi) { this.prodi = prodi; }

    public String getNama() { return nama; }

    public String getNim() { return nim; }

    public String getKelas() { return kelas; }

    public String getProdi() { return prodi; }


}
