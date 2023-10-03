import java.util.Scanner;

public class PRAK102_2210817310005_IG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("");

        int angkapertama = input.nextInt();
        int totderet = 10;
        int i = 0;
        while (i <= totderet) {
            int angka = (angkapertama % 5 == 0) ? angkapertama / 5 - 1 : angkapertama;
            System.out.print(angka);
            if (i <= totderet - 1) {
                System.out.print(",");
            }
            angkapertama++;
            i++;
        }
    }
}
