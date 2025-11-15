import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int total = 0;


        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        String[] nama = new String[jumlah];
         int[] harga = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));

            System.out.print("Nama makanan/minuman: ");
            nama[i] = input.nextLine();

            System.out.print("Harga: ");
            harga[i] = input.nextInt();
            input.nextLine(); 
        }

        
       
        for (int i = 0; i < jumlah; i++) {
            total += harga[i];
        }

        
        System.out.println("\n=== DAFTAR PESANAN ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + nama[i] + " - Rp " + harga[i]);
        }

        System.out.println("\nTotal biaya: Rp " + total);
    }
}
