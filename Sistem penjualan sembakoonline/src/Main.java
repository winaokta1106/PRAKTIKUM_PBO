import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<sembakoonline> data = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;
        do {
            System.out.println("=== SISTEM PENJUALAN SEMBAKO ONLINE ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {

                case 1:
                    tambahData();
                    break;

                case 2:
                    tampilData();
                    break;

                case 3:
                    updateData();
                    break;

                case 4:
                    hapusData();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilihan != 5);
    }

    static void tambahData() {

        System.out.print("Nama Produk: ");
        String produk = input.nextLine();

        System.out.print("Nama Pembeli: ");

        String pembeli = input.nextLine();

        System.out.print("Jumlah Beli: ");
        int jumlah = input.nextInt();

        System.out.print("Harga Produk: ");
        double harga = input.nextDouble();
        input.nextLine();

        System.out.print("Tanggal Transaksi: ");
        String tanggal = input.nextLine();

        System.out.print("Alamat Pengiriman: ");
        String alamat = input.nextLine();

        sembakoonline dataBaru = new sembakoonline(produk, pembeli, jumlah, harga, tanggal, alamat);

        data.add(dataBaru);

        System.out.println("Data berhasil ditambahkan");
    }

    static void tampilData() {

        if (data.isEmpty()) {
            System.out.println("Data kosong");
            return;
        }

        for (int i = 0; i < data.size(); i++) {
            System.out.println("\nData ke-" + (i+1));
            data.get(i).tampilkanData();
        }
    }

    static void updateData() {

        tampilData();

        System.out.print("Pilih nomor data yang ingin diupdate: ");
        int index = input.nextInt();
        input.nextLine();

        System.out.print("Nama Produk baru: ");
        String produk = input.nextLine();

        System.out.print("Nama Pembeli baru: ");
        String pembeli = input.nextLine();

        System.out.print("Jumlah baru: ");
        int jumlah = input.nextInt();

        System.out.print("Harga baru: ");
        double harga = input.nextDouble();
        input.nextLine();

        System.out.print("Tanggal baru: ");
        String tanggal = input.nextLine();

        System.out.print("Alamat baru: ");
        String alamat = input.nextLine();

        sembakoonline dataBaru = new sembakoonline(produk, pembeli, jumlah, harga, tanggal, alamat);

        data.set(index-1, dataBaru);

        System.out.println("Data berhasil diupdate");
    }

    static void hapusData() {

        tampilData();

        System.out.print("Pilih nomor data yang ingin dihapus: ");
        int index = input.nextInt();

        data.remove(index-1);

        System.out.println("Data berhasil dihapus");
    }
}