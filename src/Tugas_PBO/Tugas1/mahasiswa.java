package Tugas_PBO.Tugas1;

import java.util.ArrayList;

public class mahasiswa {
    private String nama;
    private String NIM;
    private double total_nilai;

    public mahasiswa() {
    }

    public mahasiswa(String nama, String NIM, double total_nilai) {
        this.nama = nama;
        this.NIM = NIM;
        this.total_nilai = total_nilai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getTotal_nilai() {
        return total_nilai;
    }

    public void setTotal_nilai(double total_nilai) {
        this.total_nilai = total_nilai;
    }
}
