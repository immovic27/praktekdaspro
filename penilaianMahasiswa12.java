import java.util.Scanner;

public class penilaianMahasiswa12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data mahasiswa
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        String nim = sc.nextLine();

        // Input nilai dua mata kuliah
        System.out.println("\n--- Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = sc.nextDouble();

        System.out.println("\n--- Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = sc.nextDouble();

        // Hitung nilai akhir
        double akhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        double akhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);

        // Konversi nilai ke huruf (versi singkat)
        String grade1 = (akhir1 > 80) ? "A" : (akhir1 > 73) ? "B+" : (akhir1 > 65) ? "B" :
                        (akhir1 > 60) ? "C+" : (akhir1 > 50) ? "C" : (akhir1 > 39) ? "D" : "E";
        String grade2 = (akhir2 > 80) ? "A" : (akhir2 > 73) ? "B+" : (akhir2 > 65) ? "B" :
                        (akhir2 > 60) ? "C+" : (akhir2 > 50) ? "C" : (akhir2 > 39) ? "D" : "E";

        // Status lulus per mata kuliah
        String status1 = (akhir1 >= 60) ? "LULUS" : "TIDAK LULUS";
        String status2 = (akhir2 >= 60) ? "LULUS" : "TIDAK LULUS";

        // Status semester
        double rata = (akhir1 + akhir2) / 2;
        String statusSemester = (status1.equals("LULUS") && status2.equals("LULUS") && rata >= 70)
                                ? "LULUS" : "TIDAK LULUS";

        // Output hasil
        System.out.println("\n============== HASIL PENILAIAN ==============");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("---------------------------------------------");
        System.out.printf("%-22s %-6s %-6s %-6s %-12s %-10s %-12s\n",
                          "Mata Kuliah", "UTS", "UAS", "TGS", "Nilai Akhir", "Huruf", "Status");
        System.out.printf("%-22s %-6.0f %-6.0f %-6.0f %-12.2f %-10s %-12s\n",
                          "Algoritma & Pemrograman", uts1, uas1, tugas1, akhir1, grade1, status1);
        System.out.printf("%-22s %-6.0f %-6.0f %-6.0f %-12.2f %-10s %-12s\n",
                          "Struktur Data", uts2, uas2, tugas2, akhir2, grade2, status2);
        System.out.println("---------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir : %.2f\n", rata);
        System.out.println("Status Semester       : " + statusSemester);

        sc.close();
    }
}