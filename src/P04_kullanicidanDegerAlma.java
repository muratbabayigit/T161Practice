import javax.swing.*;

public class P04_kullanicidanDegerAlma {
    public static void main(String[] args) {

        String isim = JOptionPane.showInputDialog("İsiminizi Giriniz: ");
        String soyisim = JOptionPane.showInputDialog("Soyisiminizi Giriniz: ");
        String yas = JOptionPane.showInputDialog("Yaşınızı Giriniz: ");
        int intyas = Integer.parseInt(yas);
        System.out.println("----------- Kullanıcı Bilgileri -----------");
        System.out.println("Adı : " + isim);
        System.out.println("Soyadı: " + soyisim);
        System.out.println("Yaşı: " + yas);
        System.out.println("5 yıl sonraki yaşı: " + (intyas + 5));


    }
}
