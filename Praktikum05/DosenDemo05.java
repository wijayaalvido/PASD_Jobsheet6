import java.util.Scanner;

public class DosenDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen05 data = new DataDosen05();

        for (int i = 0; i < 10; i++) {
            System.out.println("Data Dosen ke-" + (i+1));

            System.out.print("Kode: ");
            String kode = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (true=L, false=P): ");
            boolean jk = sc.nextBoolean();

            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine();

            System.out.println("------------------");

            Dosen05 d = new Dosen05(kode, nama, jk, usia);
            data.tambah(d);
        }

        System.out.println("\n=== DATA DOSEN ===");
        data.tampil();

        System.out.println("\nSorting ASC (termuda ke tertua)");
        data.bubbleSort();
        data.tampil();

        System.out.println("\nSorting DSC (tertua ke termuda)");
        data.selectionSort();
        data.tampil();
    }
}