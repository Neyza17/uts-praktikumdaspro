import java.util.Scanner;

public class StokBarangToko17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaBarang;
        int stokBarang;
        double hargaPerUnit;
        String input;
        
        while (true) {
            System.out.print("Masukkan nama barang : ");
            namaBarang = scanner.nextLine();

            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan jumlah stok barang: ");
            stokBarang = scanner.nextInt();

            System.out.print("Masukkan harga per unit barang: ");
            hargaPerUnit = scanner.nextDouble();
            scanner.nextLine();

            double totalNilaiStok = stokBarang * hargaPerUnit;
            System.out.println("Total nilai stok untuk " + namaBarang + ": Rp " + totalNilaiStok);

            System.out.print("Masukkan jumlah permintaan barang: ");
            int permintaanBarang = scanner.nextInt();
            scanner.nextLine(); 

            if (permintaanBarang <= stokBarang) {
                stokBarang -= permintaanBarang;
                System.out.println("Permintaan dapat dipenuhi. Stok tersisa: " + stokBarang);
            } else {
                System.out.println("Stok tidak mencukupi. Stok yang tersedia: " + stokBarang);
            }

        }
        scanner.close();
    }
}
