import java.util.Scanner;
public class nestedUjianSkripsi12 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);   
        String pesan;
        System.out.println("Apakah anda mahasiswa? (ya/tidak)");
        String bebasKompen = sc.nextLine().trim();
        System.out.println("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganp1 = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganp2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (bimbinganp1 >= 3 && bimbinganp2 >= 8) {
                pesan = "Semua syarat terpenuhi, Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganp1 < 8 && bimbinganp2 >= 4) {
                pesan = "Gagal! log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganp1 < 8) {
                pesan = "Gagal! log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! log bimbingan P1 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
       
    }
}
