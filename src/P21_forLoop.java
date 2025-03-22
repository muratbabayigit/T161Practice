public class P21_forLoop {

    public static void main(String[] args) {
           /*  1-180(180Dahil) arasındaki 8 ile bölünebilen sayıların toplamını yazdırın */
        int toplam=0;
        for (int i = 1; i <=180 ; i++) { //i++ equals i+=1
            if (i%8==0) {
                toplam += i;
            }
        }
        System.out.println(toplam);
    }
}
