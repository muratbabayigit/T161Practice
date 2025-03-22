public class P20_stringManipulation {
    public static void main(String[] args) {
        /*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str1= %13.99
        String str2= %10.55
      */

        String  str1="%13.99";
        String  str2= "%10.55";

        double value1=Double.parseDouble(str1.substring(1));
        double value2=Double.parseDouble(str2.substring(1));

        System.out.println("Toplam :"+(value1+value2));


        //ÖDEV

         /*

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output:
           Ad : J*** (Adın baş harfleri ve soyadı büyük olmalıdır)
           Soyad :W****
           kartNo:***********1478

           /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		         1) \\d    ==> tum rakamlar         0->9
		          	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		         2) \\w   ==> A->Z		a->z
		         	 \\W  ==> A->Z		a->z		tum harf disi character ler
		         3) \\s   ==> space
		         	 \\S   ==> space disindaki hersey

         */


    }
}
