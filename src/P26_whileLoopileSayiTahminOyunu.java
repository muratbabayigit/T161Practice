import java.util.Random;
import java.util.Scanner;

public class P26_whileLoopileSayiTahminOyunu {
    /*
        Kullanıcıdan 1 ila 100 arasında tahmin yapıp belirlenen sayıyı bulup bulmadığını kontrol eden
        bulursa tebrikler bildiniz desin. tahmin hakkı 5 olmak üzere bilemediğinde
        üzgünüm bilmediniz ve 1 tahmin hakkınız kaldı desin

  */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        //int sayi=91;
        Random random=new Random();
        int sayi= random.nextInt(1,100);
        System.out.println("1 ila 100 arasında bir sayı tuttum hadi bil!");

        int tahmin=0;
        int tahminHakki=5;
        int tahminSayisi=1;

        while(tahminHakki>0){
            System.out.print(tahminSayisi+".Tahminini gir :");
            tahmin= scan.nextInt();

            if (tahmin>sayi){
                System.out.println("Tahminin yüksek oldu. Azalt");
            }else if (tahmin<sayi){
                System.out.println("Tahminin az oldu. Arttır");
            }else{
                System.out.println(tahminSayisi+".tahmininde bildin tebrikler!");
                break;
            }
            tahminSayisi++;
            tahminHakki--;

            if (tahminHakki>0){
                System.out.println(tahminHakki+" adet tahmin hakkınız kaldı");
            }else {
                System.out.println("Üzgünüm. 5 tahminde de bilmedin. Oyun bitti!");
            }

        }

    }
}
