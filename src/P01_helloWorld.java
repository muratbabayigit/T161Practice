public class P01_helloWorld {
    public static void main(String[] args) {

/*
        SORU 1: Aşşağıdaki ifadlerin her birini tek bir satır kod içine yazarak konsola yazdırınız

            Hello World              a=3             Hello                 World
*/
        System.out.println("Hello World");
        int a=3;
        System.out.println("a = " + a);
        System.out.println("Hello              World");

        System.out.print("Merhaba"); //print yazılırsa ifadeyi yazdırır ve alt satıra geçmez. O satırdan bir sonraki kod satırını yazdırı
        System.out.println("Dünya"); //println olursa ifadeyi yazdırır ve bir sonraki satırdaki işlemi alt satırdan yazdırır
        System.out.println();


        //SORU 2:  Konsola  "Hello Java Ben Geldim"  yazdırınız.
        System.out.println("\"Hello Java Ben Geldim\"");
        //SORU 3: Konsola  'Hello Java Ben Geldim'  yazdırınız.
        System.out.println("'Hello Java Ben Geldim'");
        /* SORU-4
            Tek bir sout içinde konsola aşağıdaki ifadeyi yazdırınız
            Hello World
                "Merhaba Dünya"
         */
        System.err.println("Wise Quarter");
        System.out.println("Hello World\r\t\"Merhaba Dünya\"");

/*
        \" : ters slash işareti kendinden sonraki kod olarak algılanmamasını sağlar
        \t : bu işaret konulan string içinde işaretin konulduğu yere bit TAB tuşu(4 space) kadar boşluk bırakır
        \n or \r: String içinde konulduğu yerden itibaren aşşağı satırdan devam eder

        sout/serr
  */

        String b="10";
        int c=20;
        System.out.println(b+c); //1020
        System.out.println(Integer.parseInt(b)+c);




    }
}
