import java.util.Scanner;

public class P28_whileLoop {
    // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("5 adet sayı giriniz!");
        System.out.println("-------------------------------------------");
        int sayi=0;
        int enBuyuk=0;
        int sayac=1;
        while(sayac <= 5){
            System.out.print(sayac+". sayıyı giriniz: ");
            sayi= scan.nextInt();
            if (sayi>enBuyuk){
                enBuyuk=sayi;
            }
            sayac++;
        }
        System.out.println("Girilen sayılardan en büyüğü : "+enBuyuk);




    }
}
