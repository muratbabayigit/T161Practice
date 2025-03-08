import java.sql.SQLOutput;
import java.util.Scanner;

public class P23_forLoop {
    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç,
        // diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 5 Adet Tamsayı Giriniz");
       // System.out.print("1.Sayı : ");
      // int sayi1=input.nextInt();
      // System.out.print("2.Sayı : ");
      // int sayi2=input.nextInt();
      // System.out.print("3.Sayı : ");
      // int sayi3=input.nextInt();
      // System.out.print("4.Sayı : ");
      // int sayi4=input.nextInt();
      // System.out.print("5.Sayı : ");
      // int sayi5=input.nextInt();

        int toplam=0;
        for (int i = 1; i <=5 ; i++) {
            System.out.print(i+".Sayı : ");
            int sayi=input.nextInt();
            if (sayi>=5 && sayi<=10){
                continue; //döngüyü sıradakine gönderir
            }
            toplam+=sayi;

        }

        System.out.println(toplam);



    }
}
