import java.util.Scanner;

public class P19_stringManipulation {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.


        Scanner scan=new Scanner(System.in);
        System.out.print("İsim Soysisim: ");
        String isim=scan.nextLine();
        char one=isim.substring(0,isim.indexOf(" ")).toUpperCase().charAt(0);
        char two=isim.substring(isim.indexOf(" ")+1,isim.lastIndexOf(" ")).toUpperCase().charAt(0);
        char three=isim.substring(isim.lastIndexOf(" ")+1).toUpperCase().charAt(0);

        System.out.println(one+"."+two+"."+three+".");






    }
}
