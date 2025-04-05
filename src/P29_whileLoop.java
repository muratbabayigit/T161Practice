import java.util.Scanner;

public class P29_whileLoop {
    public static void main(String[] args) {
        // Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
        //         tamkare ise Girilen Sayı tamkare bir sayıdır
        //         değilse Girilen Sayı tamkare bir sayı değildir
        //         yazdırınız.


        //         Not: pow gibi fonksiyonları  kullanmayın.

        // Example 1:
        // Input: 16
        // Output: true
        // Not: bu sayı tamkare çünkü 4*4 = 16

        Scanner scan=new Scanner(System.in);
        System.out.print("Kontrol Etmek İstediğiniz Sayı:");
        int sayi= scan.nextInt();
        boolean tamKareMi=false;
        int i=1;

        while(i*i<=sayi){
            if (i*i==sayi){
                tamKareMi=true;
                break;
            }
            i++;
        }
        if (tamKareMi){
            System.out.println("Girdiğiniz "+sayi+" sayısı "+i+" sayısının tam karesidir");
        }else{
            System.out.println("Girdiğiniz sayı bir tam kare sayı değildir");
        }








    }
}
