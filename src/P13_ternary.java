import java.util.Scanner;

public class P13_ternary {
    /*
    Bir e-ticaret sitesinde sipariş veren müşterinin kargo ücretini hesaplayan bir Java programı yazınız.
        Eğer sipariş tutarı 500 TL veya daha fazla ise kargo ücretsizdir.
        Eğer sipariş tutarı 500 TL’nin altında ise:
        VIP müşteri olup olmadığı kontrol edilir.
        VIP müşteri ise kargo ücreti 10 TL.
        VIP müşteri değilse kargo ücreti 30 TL.
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sipariş Tutarı= ");
        double tutar = scan.nextDouble();
        System.out.print("Müteri VIP müşteri mi?(E/H): ");
        char vip = scan.next().toUpperCase().charAt(0);

        int kargoUcreti = 0;
        kargoUcreti = (tutar >= 500) ? 0 : (vip == 'E' ? 10 : 30);
        System.out.println("Kargo Ücreti: " + kargoUcreti);
        System.out.println(kargoUcreti==0?"VIP Müşteri kampanyasından yararlandınız\nÖdenecek Tutar= "+(tutar+kargoUcreti)
                :"Ödenecek Tutar:"+(tutar+kargoUcreti));

    }
}
