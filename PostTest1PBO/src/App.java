import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Peminjam peminjam = new Peminjam();
        String menu = null;
        Scanner inputMenu = new Scanner(System.in);

        do {
            System.out.println("");
            System.out.println("Halo " + peminjam.nama + "!");
            System.out.println("1. Pengajuan Peminjaman");
            System.out.println("2. Periksa Status Pengajuan");
            System.out.println("3. Hapus");
            System.out.println("4. Edit");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = inputMenu.nextLine();
            switch (menu) {
                case "1":
                    peminjam.Peminjaman(1);
                    break;
                case "2":
                    peminjam.Peminjaman(2);
                    break;
                case "3":
                    peminjam.Peminjaman(3);
                    break;
                case "4":
                    peminjam.Peminjaman(4);
                    break;
                case "0":
                    menu = "0";
                    break;
                default:
                    break;
            }
        } while (menu != "0");
        inputMenu.close();
    }

}
