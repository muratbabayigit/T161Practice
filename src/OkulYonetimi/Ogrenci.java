package OkulYonetimi;

public class Ogrenci extends Kisi{
    private String sinif;
    private int ogrNo;

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    public Ogrenci(String ad, String soyad, String tcKimlikNo, int age, String sinif, int ogrNo) {
        super(ad, soyad, tcKimlikNo, age);
        this.sinif = sinif;
        this.ogrNo = ogrNo;
    }

    public Ogrenci() {
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "sinif='" + sinif + '\'' +
                ", ogrNo=" + ogrNo +
                '}';
    }
}
