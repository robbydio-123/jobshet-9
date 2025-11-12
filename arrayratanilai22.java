import java.util.Scanner;

public class arrayratanilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMahasiswa = new int[10];
        double total = 0;
        double rata2;
        String totalnilai = "";

        System.out.println("===================Input================");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = sc.nextInt();
            total += nilaiMahasiswa[i];
            totalnilai += "Masukan Nilai Mahasiswa ke-" + (i + 1) + " adalah : " + nilaiMahasiswa[i] + "\n";
        }

        System.out.println(totalnilai);
        rata2 = total / nilaiMahasiswa.length;
         System.out.println("==================Output==============");
        System.out.printf("Rata-rata nilai = %.2f\n", rata2);

        sc.close();
    }
}