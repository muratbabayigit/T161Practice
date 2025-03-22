public class P19_forLoop {
    public static void main(String[] args) {
        // Aşağıdaki şekilde çıktı veren programı print içerisinde
        // sadece bir tane # kullanarak yazıdırınız

        //            #####
        //            #####
        //            #####
        //            #####
        //            #####

        int row=5;
        int coloumn=5;

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}
