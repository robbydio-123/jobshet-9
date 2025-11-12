import java.util.Scanner;

public class arrayangka22 {
        public static void main (String[] args){
            Scanner sc = new Scanner (System.in);

            int[] nilaiAkhir = new int[10];
            String semuaNilai = ""; 

                System.out.println("=========================");
            for(int i = 0; i < 10; i++){
                System.out.print("Masukkan nilai Akhir ke-" + i + ": ");
                nilaiAkhir[i] = sc.nextInt();

                semuaNilai += "Nilai Akhir ke-" + i + " adalah: " + nilaiAkhir[i] + "\n";
            }
            System.out.println("=========================");
            System.out.println(semuaNilai);
        }      
}