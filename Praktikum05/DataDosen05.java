import java.util.Scanner;
public class DataDosen05 {
    Scanner sc = new Scanner(System.in);
    Dosen05[] listDsn= new Dosen05[10];
    int idx;

    void tambah (Dosen05 m){
        if (idx < listDsn.length){
            listDsn[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    void bubbleSort() {
    for (int i = 0; i < idx - 1; i++) {
        for (int j = 0; j < idx - i - 1; j++) {
            if (listDsn[j].usia > listDsn[j + 1].usia) {
                Dosen05 temp = listDsn[j];
                listDsn[j] = listDsn[j + 1];
                listDsn[j + 1] = temp;
            }
        }
    }
}
    void selectionSort() {
    for (int i = 0; i < idx - 1; i++) {
        int max = i;
        for (int j = i + 1; j < idx; j++) {
            if (listDsn[j].usia > listDsn[max].usia) {
                max = j;
            }
        }
        Dosen05 temp = listDsn[max];
        listDsn[max] = listDsn[i];
        listDsn[i] = temp;
    }
}
    void tampil() {
    for (int i = 0; i < idx; i++) {
        listDsn[i].tampilInformasi();
        System.out.println("------------------");
    }
}
}