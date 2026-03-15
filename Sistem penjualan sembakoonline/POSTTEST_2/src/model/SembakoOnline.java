package model;

public class SembakoOnline {

    private static int counter = 1;

    private int idTransaksi;
    private String namaProduk;
    private String namaPembeli;
    private int jumlahBeli;
    private double hargaProduk;
    private String tanggalTransaksi;
    private String alamatPengiriman;

    public SembakoOnline() {
        idTransaksi = counter++;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public double getHargaProduk() {
        return hargaProduk;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public String getAlamatPengiriman() {
        return alamatPengiriman;
    }

    public double getTotalHarga() {
        return jumlahBeli * hargaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public void setHargaProduk(double hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public void setTanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public void setAlamatPengiriman(String alamatPengiriman) {
        this.alamatPengiriman = alamatPengiriman;
    }

    public void tampilkanData() {

        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Nama Pembeli : " + namaPembeli);
        System.out.println("Jumlah Beli : " + jumlahBeli);
        System.out.println("Harga Produk : " + hargaProduk);
        System.out.println("Total Harga : " + getTotalHarga());
        System.out.println("Tanggal Transaksi : " + tanggalTransaksi);
        System.out.println("Alamat Pengiriman : " + alamatPengiriman);
    }
}