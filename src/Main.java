import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        queue1 q1 = new queue1(5);
        queue2 q2 = new queue2(5);
        Scanner s = new Scanner(System.in);

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("--ATM INGIN KAYA--");
        System.out.println("1. Tambah Tabung");
        System.out.println("2. Tambah Ambil");
        System.out.println("3. Layani Tabung");
        System.out.println("4. Layani Ambil");
        System.out.println("5. Lihat Antrian Tabung");
        System.out.println("6. Lihat Antrian Ambil");
        System.out.println("7. Pilihan 7");
        System.out.println("8. Pilihan 8");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━");
        while (true) {
            try {
                int pilihan = s.nextInt();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━");

                switch (pilihan) {
                    case 1:
                        // Logika untuk Tambah Tabung
                        break;
                    case 2:
                        // Logika untuk Tambah Ambil
                        break;
                    case 3:
                        // Logika untuk Layani Tabung
                        break;
                    case 4:
                        // Logika untuk Layani Ambil
                        break;
                    case 5:
                        // Logika untuk Lihat Antrian Tabung
                        break;
                    case 6:
                        // Logika untuk Lihat Antrian Ambil
                        break;
                    case 7:
                        // Logika untuk Pilihan 7
                        break;
                    case 8:
                        // Logika untuk Pilihan 8
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih angka 1-8.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input salah");
                System.out.println("Pilihan menu utama");
                s.next();
            }
        }
    }
}
