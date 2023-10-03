import java.util.Scanner;

public class PRAK104_2210817310005_IG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int skorabu = 0;
        int skorbagas = 0;

        System.out.print(" Tangan Abu :  ");
        char abuinput1 = input.next().charAt(0);
        char abuinput2 = input.next().charAt(0);
        char abuinput3 = input.next().charAt(0);

        System.out.print(" Tangan Bagas : ");
        char bagasinput1 = input.next().charAt(0);
        char bagasinput2 = input.next().charAt(0);
        char bagasinput3 = input.next().charAt(0);

        if ((abuinput1 == 'B' && bagasinput1 == 'G') ||
                (abuinput1 == 'G' && bagasinput1 == 'K') ||
                (abuinput1 == 'K' && bagasinput1 == 'B')) {
            skorabu++;
        } else if ((abuinput2 == 'B' && bagasinput2 == 'G') ||
                (abuinput2 == 'G' && bagasinput2 == 'K') ||
                (abuinput2 == 'K' && bagasinput2 == 'B')) {
            skorabu++;
        }else if ((abuinput3 == 'B' && bagasinput3 == 'G') ||
                (abuinput3 == 'G' && bagasinput3 == 'K') ||
                (abuinput3 == 'K' && bagasinput3 == 'B')) {
            skorabu++;
        } else if ((abuinput1 == 'G' && bagasinput1 == 'B') ||
                (abuinput1 == 'K' && bagasinput1 == 'G') ||
                (abuinput1 == 'B' && bagasinput1 == 'K')) {
            skorbagas++;
        } else if ((abuinput2 == 'G' && bagasinput2 == 'B') ||
                (abuinput2 == 'K' && bagasinput2 == 'G') ||
                (abuinput2 == 'B' && bagasinput2 == 'K')) {
            skorbagas++;
        }  else if ((abuinput3 == 'G' && bagasinput3 == 'B') ||
                (abuinput3 == 'K' && bagasinput3 == 'G') ||
                (abuinput3 == 'B' && bagasinput3 == 'K')) {
            skorbagas++;}
        else if (skorabu > skorbagas) {
            System.out.println("Abu");
        } else if (skorabu < skorbagas) {
            System.out.println("Bagas");
        } else {
            System.out.println("SERI");
        }
    }
}
