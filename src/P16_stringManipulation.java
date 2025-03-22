public class P16_stringManipulation {
    public static void main(String[] args) {

        //indexOf
        String isim="babayigit";
        System.out.println(isim.indexOf('i')); // 5
        //lastIndexOf
        System.out.println(isim.lastIndexOf('i')); // 7

        //substring
        System.out.println(isim.substring(4)); //yigit
        System.out.println(isim.substring(4,8)); // yigi

        //replaceAll
        System.out.println(isim.substring(0,1)+isim.replaceAll("\\w","*"));
        System.out.println(isim.replace("a","e"));

        //contains,equals,equalsIgnoreCase
        System.out.println(isim.contains("e")); // false
        String isim2="BABAYİGİT";
        System.out.println(isim.equals(isim2)); //false
        System.out.println(isim.equalsIgnoreCase(isim2)); //true
        System.out.println(isim.equals(isim2.toLowerCase())); // true

        //Concatenation
        String kelime="merhaba";
        String kelime2=" nasılsın";
        System.out.println(kelime.concat(kelime2));  //merhaba nasılsın
        System.out.println(10+20+kelime.concat(kelime2));//30merhaba nasılsın
        System.out.println(kelime.concat(kelime2)+10+20);// merhaba nasılsın1020
        System.out.println(kelime.concat(kelime2)+(10+20));// merhaba nasılsın30
        int s1=100;
        System.out.println(s1+10); // 110
        System.out.println(""+s1+10); //10010
        System.out.println(""+(s1+10)); //110
        String s2=s1+"10"+200; //10010200
        System.out.println("s2 = " + s2);//10010200









    }
}
