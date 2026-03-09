public class sembakoonline {

    String namaProduk;
    String namaPembeli;
    int jumlahBeli;
    double hargaProduk;
    String tanggalTransaksi;
    String alamatPengiriman;

    public sembakoonline(String namaProduk, String namaPembeli, int jumlahBeli, double hargaProduk, String tanggalTransaksi, String alamatPengiriman) {
        this.namaProduk = namaProduk;
        this.namaPembeli = namaPembeli;
        this.jumlahBeli = jumlahBeli;
        this.hargaProduk = hargaProduk;
        this.tanggalTransaksi = tanggalTransaksi;
        this.alamatPengiriman = alamatPengiriman;
    }

    public void tampilkanData() {
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Nama Pembeli : " + namaPembeli);
        System.out.println("Jumlah Beli : " + jumlahBeli);
        System.out.println("Harga Produk : " + hargaProduk);
        System.out.println("Tanggal Transaksi : " + tanggalTransaksi);
        System.out.println("Alamat Pengiriman : " + alamatPengiriman);
    }
}