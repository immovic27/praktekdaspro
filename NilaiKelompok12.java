import java.util.Scanner;

public class NilaiKelompok12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int i, j, nilai;
        float totalNilai, rataNilai;
        
        i = 1;
        
        
        while (i <= 6) {
            totalNilai = 0; 
            j = 1;          
            
            System.out.println("Kelompok " + i);
            
            
            while (j <= 5) {
                System.out.print("  Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
                j++;
            }
            
           
            rataNilai = totalNilai / 5;
            
            
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);
            System.out.println();
            
            i++;
        }
        
        sc.close();
    }
}