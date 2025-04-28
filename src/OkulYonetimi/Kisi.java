package OkulYonetimi;

public class Kisi {
    //Ad,Soyad, Tc kimlik No, yaş,

    private String ad;
    private String soyad;
    private String tcKimlikNo;
    private int age;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Kisi(String ad, String soyad, String tcKimlikNo, int age) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcKimlikNo = tcKimlikNo;
        this.age = age;
    }

    public Kisi() {
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tcKimlikNo='" + tcKimlikNo + '\'' +
                ", age=" + age +
                '}';
    }
}
