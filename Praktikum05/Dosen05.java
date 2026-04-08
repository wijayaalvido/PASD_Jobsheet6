public class Dosen05 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen05() {
    }

    Dosen05(String kode, String name, Boolean jk, int us) {
        this.nama = name;
        this.kode = kode;
        this.jenisKelamin = jk;
        this.usia = us;
    }
    void tampilInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("Kode : " + kode);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia : " + usia);
    }
}