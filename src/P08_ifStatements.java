import java.util.Scanner;

public class P08_ifStatements {
    public static void main(String[] args) {
        // Kullanıcıdan  bir sayı alın sayı çift ise sayı çift sayıdır. Tek ise sayı tek sayıdır
        // Sıfır girmişse Sıfır girdiniz yazdırsın

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scan.nextInt();
        if(sayi==0){
            System.out.println("Girilen sayı 0 girilmiştir");
        }
        if(sayi%2==0){
            System.out.println("Girilen sayı çift sayıdır");
        }
        if(sayi%2!=0){
            System.out.println("Girilen sayı tek sayıdır");
        }


    }
}
