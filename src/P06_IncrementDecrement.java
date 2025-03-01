public class P06_IncrementDecrement {
    public static void main(String[] args) {

      // Scanner scan=new Scanner(System.in);
      // System.out.print("Adınız Soyadınız:  ");
      // String fullName= scan.nextLine();
      // System.out.print("Yaşınız:  ");
      // int age= scan.nextInt();
      // int sonNo=202501;


      // System.out.println("------ Bilgileriniz ------");
      // System.out.println("Adı Soyadı: " + fullName);
      // System.out.println("Yaşı: "+age);
      // System.out.println("Öğrenci No: "+sonNo);
      // sonNo++;
      // System.out.println("Yeni öğrenciye verilecek No: "+sonNo);
      // sonNo--;
      // System.out.println(sonNo);

        int a=120;
        System.out.println(a); //120
        a+=10;
        System.out.println(a); //130
        a-=10;
        System.out.println(a); //120
        a*=5;
        System.out.println(a); //600
        a/=10;
        System.out.println(a); //60

        int b=--a; // 1 eksilt sonra ata -- predecrement
        System.out.println("b = " + b); //b=59

        int c=b--; // önce ata sonra 1 azalt postdecrement
        System.out.println("c = " + c); //59
        System.out.println("b = " + b); //58


    }
}
