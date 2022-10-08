public class Manusia {
    private String Nama;
    private String NIM;
    private int Umur;

    public Manusia(String nama, String NIM, int umur) {
        Nama = nama;
        this.NIM = NIM;
        Umur = umur;
    }

    public Manusia(){

    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public int getUmur() {
        return Umur;
    }

    public void setUmur(int umur) {
        Umur = umur;
    }
}
