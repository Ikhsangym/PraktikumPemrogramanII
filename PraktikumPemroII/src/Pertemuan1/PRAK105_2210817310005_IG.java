import java.util.Scanner;
public class PRAK105_2210817310005_IG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Makanan Favorit : ");
        String mkn = input.nextLine();
        System.out.print("Masukkan hobi : ");
        String ho = input.nextLine();
        System.out.print("Aku Suka Makan "+mkn +", Hobiku "+ho);
    }
}