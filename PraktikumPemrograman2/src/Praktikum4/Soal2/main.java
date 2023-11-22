package Soal2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pil = input.nextInt();
        input.nextLine();

        if (pil == 1){
            String a,b,c;
            System.out.print("Nama hewan peliharaan : ");
            a = input.nextLine();
            System.out.print("Ras : ");
            b = input.nextLine();
            System.out.print("Warna bulu : ");
            c = input.nextLine();

            Kucing kuc = new Kucing(a,b,c);
            kuc.infoDetailKucing();
        } else if (pil == 2) {
            String a,b,c,d;
            System.out.print("Nama hewan peliharaan : ");
            a = input.nextLine();
            System.out.print("Ras : ");
            b = input.nextLine();
            System.out.print("Warna bulu : ");
            c = input.nextLine();
            System.out.print("Kemampuan : ");
            d = input.nextLine();
            Anjing anj = new Anjing(a,b,c,d);
            anj.infoDetailAnjing();
        }else {
            System.out.println("Tidak ada pilihan");
        }
    }
}
