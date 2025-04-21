import java.util.Arrays;
import java.util.Scanner;

public class P32_arrays {


    // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
    // kullanicidan alan ve girilen array elemanlarinin
    // en buyuk ile en kucuk elemaninin arasindaki farki gosteren java programi yazin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin uzunluğu giriniz: ");
        int n = scan.nextInt();

        int arr[]=new int[n]; //Boş bir array oluştururken muhakkak kaç elemanlı(n) olabileceğini ifade etmek gerekir

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+1+". Eleman:");
            int sayi= scan.nextInt();
            arr[i]=sayi;
        }
        System.out.println("--- Array ham girilmiş hali ----");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("--- Array sıralanmış hali ----");
        System.out.println(Arrays.toString(arr));
        int fark=arr[arr.length-1]-arr[0];
        System.out.println(arr[arr.length-1]+" ile "+arr[0]+" arasındaki fark = " + fark);

    }



}
