import java.util.Scanner;

public class P24_nestedForLoop {
    public static void main(String[] args) {
         /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *


               şeklini konsola yazdiriniz.
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("Piramit yüksekliğini girini: ");
        int boyut=scan.nextInt();
        //Priamidin satırlarını yazıralım
        for (int i=1; i<=boyut; i++){
            //1-Boşlukları yazdıralım
            for (int j = 1; j <=boyut-i; j++) {
                System.out.print(" ");
            }
            //2-Yıldızı yazdıralım
            for (int k = 1; k <=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
