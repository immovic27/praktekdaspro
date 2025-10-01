
import java.util.Scanner;

public class tugas3wifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pengguna;
        int sks = 0;

        System.out.print("Masukkan jenis pengguna (Dosen/Mahasiswa): ");
        pengguna = sc.nextLine().trim();

        if (pengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses Wifi Diberikan");
        } else if (pengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            sks = sc.nextInt();

            if (sks >= 12) {
                System.out.println("Akses Wifi Diterima");
            } else {
                System.out.println("Akses Wifi Ditolak");
            }
        } else {
            System.out.println("Akses Ditolak");
        }
    }
}
