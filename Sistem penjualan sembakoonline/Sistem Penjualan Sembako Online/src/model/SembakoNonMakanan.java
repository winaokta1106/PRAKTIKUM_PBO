package model;

public class SembakoNonMakanan extends SembakoOnline {

    private String kategori; // contoh: sabun, deterjen

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Kategori : " + kategori);
    }
    @Override
    public String getInfoTambahan() {
        return "Kategori: " + kategori;
    }
}