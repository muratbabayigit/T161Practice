public class P22_forLoop {
    public static void main(String[] args) {
        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
         * döngüden çıkılsın
         *
         * Bugün hava oldukca güzel.-> 2
         *
         *
         */
        String cumle="Bugün hava oldukca güzel";

        int sayac=0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.toUpperCase().charAt(i)=='A'){
                sayac++;
            }
            if (cumle.toLowerCase().charAt(i)=='c'){
                break; //Döngüyü durdur
            }

        }
        System.out.println(sayac);


    }
}
