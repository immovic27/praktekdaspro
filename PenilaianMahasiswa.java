import java.util.Scanner;

public class PenilaianMahasiswa {

    // Fungsi konversi nilai akhir ke huruf
    public static String getGrade(double nilai) {
        if (nilai > 80 && nilai <= 100) return "A";
        else if (nilai > 73 && nilai <= 80) return "B+";
        else if (nilai > 65 && nilai <= 73) return "B";
        else if (nilai > 60 && nilai <= 65) return "C+";
        else if (nilai > 50 && nilai <= 60) return "C";
        else if (nilai > 39 && nilai <= 50) return "D";
        else return "E";
    }

    // Fungsi status lulus per mata kuliah
    public static String getStatus(double nilai) {
        return (nilai >= 60) ? "LULUS" : "TIDAK LULUS";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        String nim = sc.nextLine();

        // Input nilai Algoritma
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = sc.nextDouble();

        // Input nilai Struktur Data
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = sc.nextDouble();

        // Hitung nilai akhir
        double akhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        double akhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);

        // Tentukan grade dan status per mata kuliah
        String grade1 = getGrade(akhir1);
        String status1 = getStatus(akhir1);

        String grade2 = getGrade(akhir2);
        String status2 = getStatus(akhir2);

        // Hitung rata-rata dan status semester
        double rataRata = (akhir1 + akhir2) / 2;
        String statusSemester;

        if (status1.equals("LULUS") && status2.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (Salah satu MK tidak lulus)";
        }

        // OUTPUT
        System.out.println("\n============== HASIL PENILAIAN AKADEMIK ==============");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("------------------------------------------------------");
        System.out.printf("%-20s %-5s %-5s %-5s %-12s %-10s %-10s\n",
                          "Mata Kuliah", "UTS", "UAS", "Tgs", "Nilai Akhir", "Nilai Huruf", "Status");
        System.out.printf("%-20s %-5.0f %-5.0f %-5.0f %-12.2f %-10s %-10s\n",
                          "Algoritma Pemrograman", uts1, uas1, tugas1, akhir1, grade1, status1