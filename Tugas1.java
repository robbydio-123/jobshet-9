import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        int n = input.nextInt();

        int[] nilai = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        int min = nilai[0];
        int max = nilai[0];

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += nilai[i];

            if (nilai[i] < min) {
                min = nilai[i];
            }

            if (nilai[i] > max) {
                max = nilai[i];
            }
        }

        double rata = (double) total / n;

        System.out.println("\n=== HASIL ===");
        System.out.println("Semua nilai:");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println("\nNilai tertinggi : " + max);
        System.out.println("Nilai terendah  : " + min);
        System.out.println("Rata-rata       : " + rata);
    }
}
