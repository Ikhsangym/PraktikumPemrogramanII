package Praktikum3.soal1;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dadu dd = new Dadu();
        int inputnilai = input.nextInt();

        dd.setInput(inputnilai);
        dd.acakDadu();
    }
}