import java.util.Scanner;

public class MahasiswaBerprestasi05 {
    Scanner sc = new Scanner(System.in);
    Mahasiswa05[] listMhs= new Mahasiswa05[5];
    int idx;

    void tambah (Mahasiswa05 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampil(){
        for (Mahasiswa05 m : listMhs){
            m.tampilInformasi();
            System.out.println("-------------------");
        }
    }

     void insertionSort(){
        for (int i=1; i<listMhs.length - 1; i++){
            Mahasiswa05 temp = listMhs[i];
            int j = i - 1;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk){
                listMhs[j] = listMhs[j + 1];
                j--;
            }
            listMhs[j + 1] = temp;
        }
    }
}