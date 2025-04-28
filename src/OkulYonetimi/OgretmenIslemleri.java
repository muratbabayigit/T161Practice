package OkulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgretmenIslemleri implements I_islemler{

    Scanner scan=new Scanner(System.in);
    int ogrNo=202501;
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

    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }

    @Override
    public void anamenu() {

    }

    @Override
    public void cikis() {

    }
}
