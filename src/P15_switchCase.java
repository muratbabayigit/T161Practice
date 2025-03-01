import java.util.Scanner;

public class P15_switchCase {

    public static void main(String[] args) {
/*
        Bir bankamatik menüsü ve seçime göre işlem yapan bir JAVA Programı Yazınız

        ========= WISE BANK ATM =========
        ============== MENU =============
            1- Hesap Bakiyesi Göster
            2- Para Çek
            3- Para Yatır
            4- Çıkış

 */

        Scanner scan=new Scanner(System.in);
        System.out.println("========== WISE BANK ATM =========\n============== MENU =============");
        System.out.println("\t1-Hesap Bakiyesi Göster\n\t2-Para Çek\n\t3-Para Yatır\n\t4-Çıkış");
        System.out.print("Hoşgeşldiniz\nLütfen Yapmak İstediğini İşlemi Seçiniz\nSeçim:");
        int secim= scan.nextInt();
        int bakiye=103256;

        switch (secim){
            case 1:
                System.out.println("\nBankamızda kayıtlı hesaplarınızın Bakiyesi: "+bakiye+"₺");
                break;
            case 2:
                System.out.print("\nÇekmek İstediğiniz Tutarı Giriniz: ");
                int cekilen= scan.nextInt();
                if (cekilen>bakiye){
                    System.out.println("Hesap tutarınız istediğiniz bakiye için Yetersizdir");
                }else {
                    System.out.println("Çekilen Tutar: "+cekilen);
                    System.out.println("Kalan Hesap Bakiyeniz: "+(bakiye-cekilen));
                }
                break;
            case 3:
                System.out.print("\nYatırmak İstediğiniz Tutarı Giriniz: ");
                int yatan= scan.nextInt();
                System.out.println("Yatırlan Tutar: "+yatan);
                System.out.println("Güncel Hesap Bakiyeniz: "+(bakiye+yatan));
                break;

            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Yanlış Giriş yaptınız. Kartınız iade ediliyor\nLütfen yeniden deneyiniz.");

        }

    }
}
