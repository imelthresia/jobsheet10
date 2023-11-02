import java.util.Scanner;

public class BioskopWithScanner12Modif {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Pilih menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    System.out.println("Masukkan nama: ");
                    String nama = sc.nextLine();
                    int baris, kolom;
                    while (true) {
                        System.out.println("Masukkan baris: ");
                        try {
                            baris = Integer.parseInt(sc.nextLine());
                            if (baris < 1 || baris > penonton.length) {
                                System.out.println("Baris tidak tersedia. Masukkan kembali.");
                                continue;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Input tidak valid. Masukkan kembali.");
                        }
                    }
                    while (true) {
                        System.out.println("Masukkan kolom: ");
                        try {
                            kolom = Integer.parseInt(sc.nextLine());
                            if (kolom < 1 || kolom > penonton[0].length) {
                                System.out.println("Kolom tidak tersedia. Masukkan kembali.");
                                continue;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Input tidak valid. Masukkan kembali.");
                        }
                    }

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan.");
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton: ");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            }
                        }
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }
        }
        sc.close();
    }
}
