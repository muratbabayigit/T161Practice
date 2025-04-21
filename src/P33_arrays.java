import java.sql.SQLOutput;
import java.util.Arrays;

public class P33_arrays {
    public static void main(String[] args) {
        // multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer
        // birer bulan
        // ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana
        // yazdıran programı yaziniz.
        // input {{10,20,30},{4,16},{6,7,20,42}}==> output ={60,20,75}

        int arr[][] = {{10, 20, 30}, {4, 16}, {6, 7, 20, 42}};


        int toplamArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                toplamArr[i] += arr[i][j];

            }
        }
        System.out.println("Toplamlardan oluşan Array:"+ Arrays.toString(toplamArr));

    }
}
