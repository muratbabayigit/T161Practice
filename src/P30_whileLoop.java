import java.util.Scanner;

public class P30_whileLoop {
    // Bir top belirli bir yüskelikten(220 m)  yükseklikten serbest bırakılıyor.
    // Atıldıktan sonra yere çarpan top, atıldığı yüksekliğin 3/4 (%75;i) u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama yüksekliği 25 santimetrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan kodu yazınız.

    public static void main(String[] args) {
        //double yukseklik=220.0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Topu bıraktığınız yüksekliği giriniz : ");
        double h= scan.nextDouble();
        int sayac=0;
        int alinanYol=0;
        double yukseklik=h;

        while(yukseklik>=0.25){
            alinanYol+=yukseklik;
            yukseklik*=0.75;
            alinanYol+=yukseklik;
            sayac++;
        }

        System.out.println(h +" yüksekliğinden serbest bıraktığını top "+sayac+" kadar zıplamış ve toplamda "+alinanYol+"m yol almıştır");
    }
}
