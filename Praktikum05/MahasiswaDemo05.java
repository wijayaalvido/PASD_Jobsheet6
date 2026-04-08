    import java.util.Scanner;
    public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi05 mhs = new MahasiswaBerprestasi05();

        System.out.println("=== INPUT DATA MAHASISWA === ");
        for (int i = 0; i < 5; i++){
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("-------------------");


            Mahasiswa05 m = new Mahasiswa05(nim, nama, kelas, ipk);
            mhs.tambah(m);
        }

    System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC) : ");
    mhs.insertionSort();
    mhs.tampil();
}
}