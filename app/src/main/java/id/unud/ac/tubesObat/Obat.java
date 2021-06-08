package id.unud.ac.tubesObat;

public class Obat {
    private String name;
    private String desc;
    private int photo;
    private String indikasi;
    private String kategori;
    private String komposisi;
    private String dosis;
    private String aturan;
    private String kemasan;
    private String perhatian;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPhoto() {
        return photo;
    }
    public void setPhoto(int photo) {
        this.photo = photo;
    }

//    -
    public String getIndikasi() {
        return indikasi;
    }
    public void setIndikasi(String indikasi) {
        this.indikasi = indikasi;
    }

    public String getKategori() {
        return kategori;
    }
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKomposisi() {
        return komposisi;
    }
    public void setKomposisi(String komposisi) {
        this.komposisi = komposisi;
    }

    public String getDosis() {
        return dosis;
    }
    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getAturan() {
        return aturan;
    }
    public void setAturan(String aturan) {
        this.aturan = aturan;
    }

    public String getKemasan() {
        return kemasan;
    }
    public void setKemasan(String kemasan) {
        this.kemasan = kemasan;
    }

    public String getPerhatian() {
        return perhatian;
    }
    public void setPerhatian(String perhatian) {
        this.perhatian = perhatian;
    }
}
