public class P17_forLoop {
    public static void main(String[] args) {
       //SORU: 0'dan 1000'e kadar(1000 dahil) 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (küçükten büyüğe).
        int toplam=0;
        for (int i = 0; i <= 1000; i++) {
            if(i%13==0){
                System.out.print(i+" ");
                toplam+=i;
            }
        }
        System.out.println();
        System.out.println("Toplam= "+toplam);

        //büyükten küçüğe
        int toplam2=0;
        for (int i = 1000; i >=0 ; i--) {
            if(i%13==0){
                System.out.print(i+" ");
                 toplam2+=i;
            }
        }
        System.out.println();
        System.out.println("Toplam= "+toplam2);

    }
}
