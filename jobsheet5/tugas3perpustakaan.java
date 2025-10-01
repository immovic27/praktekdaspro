

import java.util.Scanner;

public class tugas3perpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("apakah membawa kartu mahasiswa? (true/false): ");
        boolean kartuMhs = scanner.nextBoolean();

        System.out.print("apakah sudah melakukan registrasi online? (true/false): ");
        boolean registrasiOnline = scanner.nextBoolean();

        if (kartuMhs || registrasiOnline) {
            System.out.println("Boleh masuk");
        } else {
            System.out.println("Ditolak masuk");
        }
    }
}

