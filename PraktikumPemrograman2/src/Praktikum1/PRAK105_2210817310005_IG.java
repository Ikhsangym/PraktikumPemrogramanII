import java.util.Scanner;

public class PRAK105_2210817310005_IG {
    public static void main(String[] args) {

        final double phi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double jari2 = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        double vol = phi * Math.pow(jari2, 2) * tinggi;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan %n", jari2);
        System.out.printf("tinggi %.1f cm adalah %.3f m3%n", tinggi, vol);
    }
}
