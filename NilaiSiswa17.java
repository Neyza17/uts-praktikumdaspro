import java.util.ArrayList;
import java.util.Scanner;

public class NilaiSiswa17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namaSiswa = new ArrayList<>();
        ArrayList<Double> nilaiSiswa = new ArrayList<>();
        String nama;
        double nilai;
        double totalNilai = 0;

        // Input data siswa
        while (true) {
            System.out.print("Masukkan nama siswa (ketik 'selesai' untuk berhenti): ");
            nama = scanner.nextLine();
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }
            System.out.print("Masukkan nilai untuk " + nama + ": ");
            nilai = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan input newline

            namaSiswa.add(nama);
            nilaiSiswa.add(nilai);
            totalNilai += nilai;
        }

        // Menghitung rata-rata nilai
        int jumlahSiswa = nilaiSiswa.size();
        if (jumlahSiswa > 0) {
            double rataRata = totalNilai / jumlahSiswa;

            // Tampilkan rata-rata nilai
            System.out.printf("Rata-rata nilai kelas: %.2f%n", rataRata);

            // Tampilkan siswa yang mendapat nilai di atas rata-rata
            System.out.println("Siswa dengan nilai di atas rata-rata:");
            int jumlahDiAtasRata = 0;
            int jumlahDiBawahRata = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                if (nilaiSiswa.get(i) > rataRata) {
                    System.out.println(namaSiswa.get(i) + ": " + nilaiSiswa.get(i));
                    jumlahDiAtasRata++;
                }
            }

            // Tampilkan siswa yang mendapat nilai di bawah rata-rata
            System.out.println("Siswa dengan nilai di bawah rata-rata:");
            for (int i = 0; i < jumlahSiswa; i++) {
                if (nilaiSiswa.get(i) < rataRata) {
                    System.out.println(namaSiswa.get(i) + ": " + nilaiSiswa.get(i));
                    jumlahDiBawahRata++;
                }
            }

            // Menentukan apakah mayoritas siswa mendapat nilai di atas rata-rata
            if (jumlahDiAtasRata > jumlahSiswa / 2) {
                System.out.println("Mayoritas siswa mendapat nilai di atas rata-rata.");
            } else {
                System.out.println("Mayoritas siswa tidak mendapat nilai di atas rata-rata.");
            }
        } else {
            System.out.println("Tidak ada data siswa yang dimasukkan.");
        }

        scanner.close();
    }
}
