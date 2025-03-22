import java.util.Scanner;

public class P18_Stringmanipulation {
    // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
    // ad ayrı soyad ayrı sekilde ekrana yazdırınız

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("İsim Soyisim (bir isim bir soyisim şeklinde giriniz) : ");
        String isimSoyisim= scan.nextLine();
        String isim=isimSoyisim.substring(0,isimSoyisim.indexOf(" "));
        String ikinciIsim=isimSoyisim.substring(isimSoyisim.indexOf(" ")+1,isimSoyisim.lastIndexOf(" "));
        String soyisim=isimSoyisim.substring(isimSoyisim.lastIndexOf(" ")+1);
       //string.substtring(başlangıcIndex,bitisIndex) bitisIndex dahil değildir
       //string.substtring(başlangıcIndex) baslangıcIndex'ten sona kadar alır

        System.out.println("İsim: "+isim+" "+ikinciIsim+"\nSoyisim: "+soyisim);
        //          Tarık Berk Babayiğit
        //İki İsim İki Soyisinm olarak yazdırmayı deneyin


    }
}
