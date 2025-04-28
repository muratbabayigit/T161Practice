package OkulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciIslemleri implements I_islemler{
  /*

    Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.

	============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 5-ANA MENÜ
		 Q-ÇIKIŞ

	SEÇİMİNİZ:

   */
    Scanner scan=new Scanner(System.in);
    int ogrNo=202500;
    List<Ogrenci> ogrenciList=new ArrayList<>();

    void ogrMenu(){
        System.out.println("============= İŞLEMLER =============");
        System.out.println("\t1-EKLEME\n\t2-ARAMA\n\t3-LİSTELEME\n\t4-SİLME\n\t5-ANA MENÜ\n\tQ-ÇIKIŞ");
        System.out.print("Seçiminiz: ");
        char secim=scan.next().toLowerCase().charAt(0);

        switch (secim){
            case '1':{ekleme();break;}
            case '2':{arama();break;}
            case '3':{listeleme();break;}
            case '4':{silme();break;}
            case '5':{anamenu();break;}
            case 'Q':{cikis();break;}
        }


    }

    @Override
    public void ekleme() {
        System.out.println("====================================\n YENİ ÖĞRENCİ EKLME MODÜLÜ \n====================================");
        scan.nextLine();
        System.out.print("Adı: ");
        String ad= scan.nextLine();
        System.out.print("Soyadı: ");
        String soyad= scan.nextLine();
        System.out.print("TC Kimlik No: ");
        String tcKimlikNo= scan.nextLine();
        System.out.print("Yaşı: ");
        int age= scan.nextInt();
        System.out.print("Sınıfı: ");
        scan.nextLine();
        String sinif= scan.nextLine();
        Ogrenci ogrenci=new Ogrenci(ad,soyad,tcKimlikNo,age,sinif,ogrNo++);
        ogrenciList.add(ogrenci);
        System.out.println("İşlem Tamamalandı.");
        System.out.println("Kaydedilen Öğrenci Bilgileri:");
        //listeleme();
        ogrMenu();


    }

    @Override
    public void arama() {
        System.out.println("====================================\n ÖĞRENCİ ARAMA MODÜLÜ \n====================================");
        scan.nextLine();
        System.out.print("TC Kimlik Numarası: ");
        String tcKimlikNo= scan.nextLine();

        for (Ogrenci each:ogrenciList) {
            if (each.getTcKimlikNo().equals(tcKimlikNo)){
                System.out.println("Aradığınız Kişi: \n"+each);
                ogrMenu();
            }else {
                System.out.println("kayıtlarımızda "+tcKimlikNo+ " numaralı bir kayıt bulunmamaktadır");
                ogrMenu();
            }

        }





    }

    @Override
    public void listeleme() {
        for (Ogrenci each:ogrenciList ) {
            System.out.println(each);
        }

    }

    @Override
    public void silme() {
        System.out.println("====================================\n ÖĞRENCİ SİLME MODÜLÜ \n====================================");
        scan.nextLine();
        System.out.print("TC Kimlik Numarası: ");
        String tcKimlikNo= scan.nextLine();
        for (Ogrenci each:ogrenciList) {
            if (each.getTcKimlikNo().equals(tcKimlikNo)){
                ogrenciList.remove(each);
                System.out.println(tcKimlikNo+" numaralı kayıt silindi");
                listeleme();
                ogrMenu();
            }

        }


    }

    @Override
    public void anamenu() {
        AnaMenu anaMenu=new AnaMenu();
        anaMenu.menu();

    }

    @Override
    public void cikis() {
        System.exit(0);

    }
}
