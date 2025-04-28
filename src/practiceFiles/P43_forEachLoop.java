package practiceFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P43_forEachLoop {
    public static void main(String[] args) {
        // Kullanıcıdan 5 adet not alarak bir ArrayList oluşturun.
        // Bu notların ortalamasını ( GANO ) hesaplayarak ekrana yazdırın.

        // Örnek çıktı:
        // Notların ortalaması: 78.5


        Scanner scan=new Scanner(System.in);
          System.out.println("Lütfen Sizden istenen değerleri giriniz!");
          ArrayList<Double> notlar=new ArrayList<>();
          for (int i = 0; i < 5; i++) {
              System.out.print(i+1+". notu giriniz:");
              double not= scan.nextDouble();
              notlar.add(not);
          }
          double toplam=0;
          for (double a:notlar) {
              toplam+=a;
          }
          System.out.println("Genel Akademik Not Ortalamanız: "+(toplam/notlar.size()));

        // While ile Çözümü - Sinan Bozkurt

     //        List<Double> notlars = new ArrayList<>();
     //        int sayac=0;
     //        //sayın hocam 5 adet sayıyı double olabilecek şekilde aldım
     //        while (sayac<=4){
     //            System.out.println((sayac+1) +". ort alınacak sayıyı giriniz:");
     //            double not=scan.nextDouble();
     //            sayac++;
     //        }
     //        double ortalama = 0;
     //        int i = 0;

     //        //Saygıdeğer hocam ortalamasını alacağız bu sayıların.
     //        while (i<notlars.size()){
     //            ortalama+=(notlars.get(i))/i;
     //            i++;
     //        }
     //        System.out.println(ortalama);


    }
}
