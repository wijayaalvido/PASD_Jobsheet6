    import java.util.Scanner;
    public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        
        MahasiswaBerprestasi05 list = new MahasiswaBerprestasi05(jumMhs);

        System.out.println("=== INPUT DATA MAHASISWA === ");
        for (int i = 0; i < jumMhs; i++){
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
            list.tambah(m);
        }

        list.tampil();
        list.insertionSort();

    //melakukan pencarian data binary
    System.out.println("------------------------------");
    System.out.println("Pencarian data");
    System.out.println("------------------------------");
    System.out.println("Masukkan IPK mahasiswa yang dicari: ");
    System.out.print("IPK: ");
    double cari = sc.nextDouble();
    System.out.println("-------------------------------");
    System.out.println("Menggunakan binary search");
    System.out.println("---------------------------------");
    
    double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
    int pss2 = (int) posisi2;

    list.tampilPosisi(cari, pss2);
    list.tampilDataSearch(cari, pss2);
    }
}