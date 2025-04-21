public class P35_arrays {
    public static void main(String[] args) {
        /*
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,3},{4,5},{6,7,8}}
         * Output : 8
         */


        int arr [][]={{1,2,-3},{4,55},{6,17,8}};
        int enBuyuk=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>enBuyuk){
                    enBuyuk=arr[i][j];
                }
            }
            
        }
        System.out.println("En büyük değerli eleman: "+enBuyuk);
    }
}
