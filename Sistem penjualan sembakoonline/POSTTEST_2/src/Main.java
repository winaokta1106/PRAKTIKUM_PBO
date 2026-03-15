import model.SembakoOnline;
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
                System.out.println("3. Update Data");
                System.out.println("4. Hapus Data");
                System.out.println("5. Keluar");

                System.out.print("Pilih Menu : ");

                if(!input.hasNextInt()){
                    throw new Exception("Input harus angka");
                }

                pilihan = input.nextInt();
                input.nextLine();

                switch(pilihan){

                    case 1:

                        SembakoOnline transaksi = new SembakoOnline();

                        System.out.print("Nama Produk : ");
                        transaksi.setNamaProduk(input.nextLine());

                        System.out.print("Nama Pembeli : ");
                        transaksi.setNamaPembeli(input.nextLine());

                        System.out.print("Jumlah Beli : ");
                        transaksi.setJumlahBeli(input.nextInt());
                        input.nextLine();

                        System.out.print("Harga Produk : ");
                        transaksi.setHargaProduk(input.nextDouble());
                        input.nextLine();

                        System.out.print("Tanggal Transaksi : ");
                        transaksi.setTanggalTransaksi(input.nextLine());

                        System.out.print("Alamat Pengiriman : ");
                        transaksi.setAlamatPengiriman(input.nextLine());

                        dataTransaksi.add(transaksi);

                        System.out.println("Data berhasil ditambahkan");
                        break;

                    case 2:

                        if(dataTransaksi.isEmpty()){
                            System.out.println("Data masih kosong");
                        }else{

                            for(int i=0;i<dataTransaksi.size();i++){

                                System.out.println("\nData ke-" + (i+1));
                                dataTransaksi.get(i).tampilkanData();
                                System.out.println("==========================");

                            }

                        }
                        break;

                    case 3:

                        System.out.print("Masukkan nomor data : ");
                        int nomorUpdate = input.nextInt();
                        input.nextLine();

                        if(nomorUpdate <1 || nomorUpdate > dataTransaksi.size()){

                            System.out.println("Data tidak ditemukan");

                        }else{

                            SembakoOnline transaksiBaru = new SembakoOnline();

                            System.out.print("Nama Produk : ");
                            transaksiBaru.setNamaProduk(input.nextLine());

                            System.out.print("Nama Pembeli : ");
                            transaksiBaru.setNamaPembeli(input.nextLine());

                            System.out.print("Jumlah Beli : ");
                            transaksiBaru.setJumlahBeli(input.nextInt());
                            input.nextLine();

                            System.out.print("Harga Produk : ");
                            transaksiBaru.setHargaProduk(input.nextDouble());
                            input.nextLine();

                            System.out.print("Tanggal Transaksi : ");
                            transaksiBaru.setTanggalTransaksi(input.nextLine());

                            System.out.print("Alamat Pengiriman : ");
                            transaksiBaru.setAlamatPengiriman(input.nextLine());

                            dataTransaksi.set(nomorUpdate-1, transaksiBaru);

                            System.out.println("Data berhasil diupdate");

                        }

                        break;

                    case 4:

                        System.out.print("Masukkan nomor data : ");
                        int nomorHapus = input.nextInt();

                        if(nomorHapus <1 || nomorHapus > dataTransaksi.size()){

                            System.out.println("Data tidak ditemukan");

                        }else{

                            dataTransaksi.remove(nomorHapus-1);
                            System.out.println("Data berhasil dihapus");

                        }

                        break;

                    case 5:

                        System.exit(0);

                    default:

                        System.out.println("Menu tidak tersedia");

                }

            }catch(Exception e){

                System.out.println("Terjadi kesalahan : " + e.getMessage());
                input.nextLine();

            }

        }

    }

}