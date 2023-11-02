import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Masukkan nama: ");
            String nama = sc.nextLine(); 
            System.out.println("Masukkan baris: ");
            int baris = Integer.parseInt(sc.nextLine()); 
            System.out.println("Masukkan kolom: ");
            int kolom = Integer.parseInt(sc.nextLine()); 

            penonton[baris-1][kolom-1] = nama;

            System.out.println("Input penonton lainnya? (y/n):");
            String next = sc.nextLine(); 

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        sc.close(); 
    }
}