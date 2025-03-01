import java.util.Scanner;

public class P12_nestedIfElseStatements {
/*
    Bir e-ticaret sitesinde sipariş veren müşterinin kargo ücretini hesaplayan bir Java programı yazınız.
        Eğer sipariş tutarı 500 TL veya daha fazla ise kargo ücretsizdir.
        Eğer sipariş tutarı 500 TL’nin altında ise:
        VIP müşteri olup olmadığı kontrol edilir.
        VIP müşteri ise kargo ücreti 10 TL.
        VIP müşteri değilse kargo ücreti 30 TL.
*/
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.print("Sipariş Tutarı : ");
            double tutar= scan.nextDouble();

            if (tutar<500.0){
                System.out.print("Müteri VIP müşteri mi?(E/H): ");
                char vip=scan.next().toUpperCase().charAt(0);
                if (vip=='E'){
                    System.out.println("Kargo Ücreti: 10₺");
                    System.out.println("Ödenecek Tutar: "+(tutar+10));
                }else{
                    System.out.println("Kargo Ücreti: 30₺");
                    System.out.println("Ödenecek Tutar: "+(tutar+30));
                }

            }else{
                System.out.println("500₺ üzeri siparişiniz var. \nBu nedenle VIP müşterilerimize özel \"Kargo Ücretsiz\" seçeneğinden yararlandınız");
                System.out.println("Kargo Ücreti: 0₺");
                System.out.println("Ödenecek Tutar: "+tutar);


            }
            System.out.println("Wise Quarter'dan Java Öğreniyorum"); // Wise Quarter'dan Java Öğreniyorum

           // Wise Quarter'dan "Java" Öğreniyorum
            System.out.println("Wise Quarter'dan \"Java\" Öğreniyorum");

        }
}
