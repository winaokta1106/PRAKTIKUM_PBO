package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        ArrayList<SembakoOnline> dataTransaksi = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int pilihan;

        while(true){

            try{

                System.out.println("\n=== Sistem Penjualan Sembako Online ===");
                System.out.println("1. Tambah Data");
                System.out.println("2. Tampilkan Data");
                System.out.println("3. Hapus Data");
                System.out.println("4. Keluar");
                System.out.print("Pilih Menu : ");

                if(!input.hasNextInt()){
                    throw new Exception("Input harus angka");
                }

                pilihan = input.nextInt();
                input.nextLine();

                switch(pilihan){

                    case 1:

                        System.out.println("\nPilih Jenis Sembako:");
                        System.out.println("1. Makanan");
                        System.out.println("2. Minuman");
                        System.out.println("3. Non-Makanan");
                        System.out.print("Pilih : ");

                        int jenis = input.nextInt();
                        input.nextLine();

                        if(jenis == 1){

                            SembakoMakanan m = new SembakoMakanan();

                            System.out.print("Jenis Makanan: ");
                            m.setJenisMakanan(input.nextLine());

                            System.out.print("Nama Produk : ");
                            m.setNamaProduk(input.nextLine());

                            System.out.print("Nama Pembeli : ");
                            m.setNamaPembeli(input.nextLine());

                            System.out.print("Jumlah Beli : ");
                            m.setJumlahBeli(input.nextInt());
                            input.nextLine();

                            System.out.print("Harga Produk : ");
                            m.setHargaProduk(input.nextDouble());
                            input.nextLine();

                            System.out.print("Tanggal Transaksi : ");
                            m.setTanggalTransaksi(input.nextLine());

                            System.out.print("Alamat Pengiriman : ");
                            m.setAlamatPengiriman(input.nextLine());

                            dataTransaksi.add(m);

                        } else if(jenis == 2){

                            SembakoMinuman m = new SembakoMinuman();

                            System.out.print("Jenis Minuman: ");
                            m.setJenisMinuman(input.nextLine());

                            System.out.print("Nama Produk : ");
                            m.setNamaProduk(input.nextLine());

                            System.out.print("Nama Pembeli : ");
                            m.setNamaPembeli(input.nextLine());

                            System.out.print("Jumlah Beli : ");
                            m.setJumlahBeli(input.nextInt());
                            input.nextLine();

                            System.out.print("Harga Produk : ");
                            m.setHargaProduk(input.nextDouble());
                            input.nextLine();

                            System.out.print("Tanggal Transaksi : ");
                            m.setTanggalTransaksi(input.nextLine());

                            System.out.print("Alamat Pengiriman : ");
                            m.setAlamatPengiriman(input.nextLine());

                            dataTransaksi.add(m);

                        } else if(jenis == 3){

                            SembakoNonMakanan n = new SembakoNonMakanan();

                            System.out.print("Kategori: ");
                            n.setKategori(input.nextLine());

                            System.out.print("Nama Produk : ");
                            n.setNamaProduk(input.nextLine());

                            System.out.print("Nama Pembeli : ");
                            n.setNamaPembeli(input.nextLine());

                            System.out.print("Jumlah Beli : ");
                            n.setJumlahBeli(input.nextInt());
                            input.nextLine();

                            System.out.print("Harga Produk : ");
                            n.setHargaProduk(input.nextDouble());
                            input.nextLine();

                            System.out.print("Tanggal Transaksi : ");
                            n.setTanggalTransaksi(input.nextLine());

                            System.out.print("Alamat Pengiriman : ");
                            n.setAlamatPengiriman(input.nextLine());

                            dataTransaksi.add(n);

                        } else {
                            System.out.println("Pilihan tidak valid!");
                        }

                        System.out.println("Data berhasil ditambahkan!");
                        break;

                    case 2:

                        if(dataTransaksi.isEmpty()){
                            System.out.println("Data masih kosong");
                        } else {
                            for(int i = 0; i < dataTransaksi.size(); i++){
                                System.out.println("\nData ke-" + (i+1));
                                dataTransaksi.get(i).tampilkanData();
                                System.out.println("==========================");
                            }
                        }
                        break;

                    case 3:

                        System.out.print("Masukkan nomor data yang ingin dihapus : ");
                        int hapus = input.nextInt();

                        if(hapus < 1 || hapus > dataTransaksi.size()){
                            System.out.println("Data tidak ditemukan");
                        } else {
                            dataTransaksi.remove(hapus - 1);
                            System.out.println("Data berhasil dihapus");
                        }
                        break;

                    case 4:
                        System.out.println("Terima kasih!");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Menu tidak tersedia");
                }

            } catch(Exception e){
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                input.nextLine();
            }

        }
    }
}