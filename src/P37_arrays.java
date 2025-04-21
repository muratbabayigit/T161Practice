import java.util.Arrays;

public class P37_arrays {
    public static void main(String[] args) {

        /*
         * Write a method which accepts string as parameter and prints the sum of digits
         * present in thr given string input :"ade1r4d3" output : 8 ;
         * trick : Use --> Character.isDigit() --> Integer.valueOf()
         */

        String kelime="a4e8r64fg9b3c10";
        String arr[]=kelime.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println("  ");
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i].charAt(0))){
                toplam+=Integer.valueOf(arr[i]);
            }
        }
        System.out.println("toplam = " + toplam);





    }
}
