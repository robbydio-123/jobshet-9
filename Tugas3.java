import java.util.Scanner;

public class Tugas3
 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar", 
            "Kentang Goreng", 
            "Teh Tarik", 
            "Cappucino", 
            "Chocolate Ice"
        };

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cari = input.nextLine();

        int index = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) { 
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Makanan \"" + cari + "\" tersedia di menu.");
        } else {
            System.out.println("Makanan \"" + cari + "\" tidak ditemukan di menu.");
        }

        input.close();
    }
}
