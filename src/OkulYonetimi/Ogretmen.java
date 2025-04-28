package OkulYonetimi;

public class Ogretmen extends Kisi{

    //bolum ve sicilNo

    private String bolum;
    private int sicilNo;

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String ad, String soyad, String tcKimlikNo, int age, String bolum, int sicilNo) {
        super(ad, soyad, tcKimlikNo, age);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen() {

    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo=" + sicilNo +
                '}';
    }
}
