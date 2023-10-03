import java.util.Scanner;
public class PRAK103_2210817310005_IG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Input Nilai N dan Bilangan Awal : ");
        int nilain = input.nextInt();
        int bilanganawal = input.nextInt();
        int i = 0, j = bilanganawal;
        do {
            if (j % 2 != 0) {
                System.out.printf("%d", j);
                if (i < nilain - 1){
                    System.out.printf(", ");
                }i++;
            }j++;
        } while (i < nilain);
    }
}