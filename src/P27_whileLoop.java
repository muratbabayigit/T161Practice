import java.util.Scanner;

public class P27_whileLoop {
    /*
        kullanıcdan alınan bir sayinin basamak degerlerinin toplamini
         while loop ile yazdıran bir method create ediniz.

   */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 100'den büyük bir tam sayı giriniz: ");
        long sayi= scan.nextLong();

        basamakDegeriTopla(sayi);

    }

    public static void basamakDegeriTopla(long sayi) {
        long girilenSayi=sayi;
        long toplam=0;
            while(sayi!=0){
                toplam+=sayi%10;
                sayi/=10;
            }
        System.out.println("Girmiş olduğunuz "+girilenSayi+" sayısının basamak değerleri toplamı: "+toplam);
    }


}
