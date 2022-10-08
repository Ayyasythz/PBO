package Tugas_PBO.Tugas1;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        mahasiswa a = new mahasiswa();
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Nama : ");
        String nama = in.nextLine();
        System.out.print("Masukan NIM : ");
        String nim = in.nextLine();
        a.setNama(nama);
        a.setNIM(nim);

        System.out.print("Masukan Nilai Tubes : ");
        double tubes = in.nextDouble();
        System.out.print("Masukan Nilai Quiz : ");
        double quiz = in.nextDouble();
        System.out.print("Masukan Nilai Tugas : ");
        double tugas = in.nextDouble();
        System.out.print("Masukan Nilai UTS : ");
        double uts = in.nextDouble();
        System.out.print("Masukan Nilai UAS : ");
        double uas = in.nextDouble();

        double total = (tubes * 0.3) + (quiz * 0.1) + (tugas * 0.1) + (uts * 0.25) + (0.25 * uas);

        a.setTotal_nilai(total);

        System.out.println("======================================");
        System.out.println("Nama = " + a.getNama());
        System.out.println("NIM = " + a.getNIM());
        System.out.println("Total Nilai = " + a.getTotal_nilai());





    }
}
