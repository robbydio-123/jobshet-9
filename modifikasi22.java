import java.util.Scanner;

public class modifikasi22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int[] nilai = new int[10];

       System.out.println("=== input ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.println("=== Output ===");

        
        for (int i = 0; i < nilai.length; i++) {
            String status;
            if (nilai[i] >= 60) {
                status = "Lulus";
            } else {
                status = "Tidak Lulus";
            }
            
            System.out.println("Mahasiswa ke-" + i +  " : Nilai = " 
                                + nilai[i] + "-" 
                                +  status);
        }

        input.close();
    }
}
