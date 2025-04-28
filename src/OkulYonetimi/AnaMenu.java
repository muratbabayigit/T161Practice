package OkulYonetimi;

import java.awt.*;
import java.util.Scanner;

public class AnaMenu {
 /*
    Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için aşağıdaki gibi bir menü gösterilsin.

	====================================
	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
	====================================
	    1- ÖĞRENCİ İŞLEMLERİ
	    2- ÖĞRETMEN İŞLEMLERİ
	    Q- ÇIKIŞ

	SEÇİMİNİZ:

  */

    void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("====================================\n ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ \n====================================");
        System.out.println("\t1- ÖĞRENCİ İŞLEMLERİ\n\t2- ÖĞRETMEN İŞLEMLERİ\n\tQ- ÇIKIŞ");
        System.out.print("SEÇİMİNİZ: ");
        char secim = scan.next().toLowerCase().charAt(0);

        switch (secim) {
            case '1': {
                OgrenciIslemleri ogrenciIslemleri=new OgrenciIslemleri();
                ogrenciIslemleri.ogrMenu();
            }
            case '2': {
                OgretmenIslemleri ogretmenIslemleri=new OgretmenIslemleri();

            }
            case 'Q': {
                System.exit(0);

            }
            default: {
                System.out.println("Hatalı Giriş Yaptınız. Tekrar Deneyiniz");
                menu();


            }
        }
    }
}
