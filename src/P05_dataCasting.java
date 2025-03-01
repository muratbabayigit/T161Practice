import java.util.Scanner;

public class P05_dataCasting {
     /*
        Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıya bölün ve
        sonucu tam sayı yazdırın
     */
     public static void main(String[] args) {
         //   byte < short < int < long < float < double

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki adet ondalıklı sayı giriniz.");
        System.out.print("1. Sayı: ");
        double sayi1= scan.nextDouble();
        System.out.print("2.Sayı: ");
        double sayi2= scan.nextDouble();
        double sonucDbl=sayi1/sayi2;
        System.out.println("sonucDbl = " + sonucDbl);
        int sonuc=(int)(sayi1/sayi2);
        System.out.println("Sonuç = " + sonuc);

          System.out.println("---------- İKİNCİ İŞLEM -----------");
          /*
        Kullanıcıdan iki int sayı alın ve ilk sayıyı ikinci sayıya bölün ve
        sonucu ondalıklı sayı olarak yazdırın
    */
          System.out.println("Lütfen iki adet tam sayı giriniz.");
          System.out.print("1. Sayı: ");
          int sayi3= scan.nextInt();
          System.out.print("2. Sayı: ");
          int sayi4= scan.nextInt();
          double sonuc2=  (double) sayi3 /sayi4;
          System.out.println("sonuc2 = " + sonuc2);

     }

}
