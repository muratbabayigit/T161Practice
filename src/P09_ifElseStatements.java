import java.util.Scanner;

public class P09_ifElseStatements {
    public static void main(String[] args) {
        // Kullanıcıdan  bir sayı alın sayı çift ise sayı çift sayıdır. Tek ise sayı tek sayıdır
        // Sıfır girmişse Sıfır girdiniz yazdırsın
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        int sayi= scan.nextInt();
        if (sayi==0){
            System.out.println("Girilen sayı sıfırdır");
        } else if (sayi%2==0) {
            System.out.println("Girilen sayı çift sayıdır");
        }else{
            System.out.println("Girilen sayı tek sayıdır");
        }
    }
}
