package practiceFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P40_List {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.


        List<Integer> nots=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Not girmek için E Tuşuna basınız");
        char devam=scan.next().toUpperCase().charAt(0);

        while (devam=='E'){
            System.out.print("Not Girişi: ");
            nots.add(scan.nextInt());
            System.out.print("Yeni bir not girecek misiniz ? (E/H): ");
            devam=scan.next().toUpperCase().charAt(0);
        }
        System.out.println("Sisteme Girilen Notlar: "+nots);

        double ortalama=0;
        int toplam=0;

        for (Integer each:nots ) {
            toplam+=each;
        }
        ortalama=toplam/ nots.size();
        System.out.println("Girilen notların ortalaması: "+ortalama);
        
        List<Double> ortalmaUstu=new ArrayList<>();
        for (double each2:nots) { //Wrapper class değil variable olarak tanımladım
            if (each2>ortalama){
                ortalmaUstu.add(each2);
            }
            
        }

        System.out.println("ortalama Üstündeki Öğrenci Sayısı: "+ ortalmaUstu.size());
    }
}
