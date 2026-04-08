public class Mahasiswa05 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa05() {
    }

    Mahasiswa05(String nim, String name, String kls, double ip) {
        this.nama = name;
        this.nim = nim;
        this.kelas = kls;
        this.ipk = ip;
    }
    void tampilInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}