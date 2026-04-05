package model;

public class SembakoMakanan extends SembakoOnline {

    private String jenisMakanan; // contoh: kering / basah

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis Makanan : " + jenisMakanan);
    }
}