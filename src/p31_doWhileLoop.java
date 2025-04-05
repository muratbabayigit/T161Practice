import java.util.Scanner;

public class p31_doWhileLoop {

    // Verilen bir sayının faktöriyelini özyineli (recursive) olarak
    // hesaplayan fonksiyonu yazınız.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi= scan.nextInt();
        int faktoriyelDeger=1;

        do{
        faktoriyelDeger*=sayi;
        sayi--;
        }while(sayi>0);
        System.out.println(faktoriyelDeger);
    }

    //Soru aynı soruyu while loop ile yapınız
}
