import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        queue1 q1 = new queue1(5);
        queue2 q2 = new queue2(5);
        Menu mn = new Menu();
        Scanner s = new Scanner(System.in);

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("--ATM INGIN KAYA--");
        System.out.println("1. Tambah Tabung");
        System.out.println("2. Tambah Ambil");
        System.out.println("3. Layani Tabung");
        System.out.println("4. Layani Ambil");
        System.out.println("5. Lihat Antrian Tabung");
        System.out.println("6. Lihat Antrian Ambil");
        System.out.println("7. Lihat Antrian Belakang Tabung ");
        System.out.println("8. Lihat Antrian Belakang Ambil");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━");
        while (true) {
            try {
                System.out.println("Masukan Piliahan Anda : ");
                int pilihan = s.nextInt();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━");

                switch (pilihan) {
                    case 0 -> {
                        System.out.println("Terima Kasih Telah Menggunakan Program");
                        return; // keluar dari program
                    }
                    case 1 -> {
                        // Logika untuk Tambah Tabung
                        q1.enqueue();
                        System.out.println("Telah menambahkan Antrian");
                        mn.menu_utama();
                    }
                    case 2 -> {
                        // Logika untuk Tambah Ambil
                        q2.enqueue();
                        System.out.println("Telah Menambahkan Antrian");
                        mn.menu_utama();
                    }
                    case 3 -> {
                        // Logika untuk Layani Tabung
                        q1.dequeue();
                        System.out.println("Telah Menghapus Antrian");
                        mn.menu_utama();
                    }
                    case 4 -> {
                        // Logika untuk Layani Ambil
                        q2.dequeue();
                        System.out.println("Telah Menghapus Antrian");
                        mn.menu_utama();
                    }
                    case 5 -> {
                        // Logika untuk Lihat Antrian Tabung
                        q1.tampil();
                        mn.menu_utama();
                    }
                    case 6 -> {
                        // Logika untuk Lihat Antrian
                        q2.tampil();
                        mn.menu_utama();
                    }
                    case 7 -> {
                        // Logika untuk Pilihan 7
                        q1.peek_belakang();
                        mn.menu_utama();
                    }
                    case 8 -> {
                        // Logika untuk Pilihan 8
                        q2.peek_belakang();
                        mn.menu_utama();
                    }
                    default -> System.out.println("Pilihan tidak valid. Silakan pilih angka 1-8.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input salah");
                System.out.println("Pilihan menu utama");
                s.next();
            }
        }
    }

}
