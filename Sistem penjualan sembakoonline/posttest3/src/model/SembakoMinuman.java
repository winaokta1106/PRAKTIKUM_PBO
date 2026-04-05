package model;

public class SembakoMinuman extends SembakoOnline {

    private String jenisMinuman; // contoh: dingin / panas

    public void setJenisMinuman(String jenisMinuman) {
        this.jenisMinuman = jenisMinuman;
    }

    public String getJenisMinuman() {
        return jenisMinuman;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis Minuman : " + jenisMinuman);
    }
}