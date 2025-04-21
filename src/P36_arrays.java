import java.util.Arrays;

public class P36_arrays {
    public static void main(String[] args) {
        /*
         * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
         *
         * String str = "$1 $23 $134 $2 $7 $24 €32 €40 €2 €65 €4 ";
         */
        String str = "$1 $23 $134 $2 $7 $24 €32 €40 €2 €65 €4 ";
        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));
        int kasa$=0;
        int kasa€=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")){
                kasa$+=Integer.parseInt(arr[i].replace("$",""));
            }else{
                kasa€+=Integer.parseInt(arr[i].replace("€",""));
            }

        }
        System.out.println("Dolarlar Toplamı: "+kasa$);
        System.out.println("Eurolar Toplamı: "+kasa€);





    }
}
