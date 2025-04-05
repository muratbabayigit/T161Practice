import java.util.Scanner;

public class P25_whileLoop {
    /*
        While döngü sayısı belli olmayan durumlarda kullanılır. Döngü başlangıcı ya da bitişi belli olmayan durumlarda kullanılır
        Bir koşul belirlenip o koşulun sağlanması durumuna göre hareket eder. Koşul hiç sağlanmazsa hiç çalışmaz

     */

    // Kullanıcıdan bir kelime girmesini isteyip kelimenin içindeki
    // indexi çift sayi olan karakterleri yazdiran bir code create ediniz
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String kelime = scan.next(); //scan.next kullanma sebebimiz, kullanıcının birden fazla kelime girmesi durumunda ilk kelimeyi almak
        int index = 0;

        //biz girilen kelimenin uzunluğu(harf sayısını) kelime.length() ile buluruz.
        // son harfin index numarası ise bu uzunluğun bir eksiğidir. Çünkü index 0 ile başlar

        while (index <= kelime.length() - 1) { //Burada şart belirlenir

            if (index%2==0){
                System.out.println(index+".index : "+kelime.charAt(index));
            }
           index++;
        }

    }


}
