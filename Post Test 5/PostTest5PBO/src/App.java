import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        String username;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Username :");
        username = input.nextLine();

        // User user = new User(username);
        // user.menu();
        // input.close();
        boolean status = true;
        String menu = null;
        Scanner inputMenu = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println("Selamat datang di aplikasi peminjaman! " + username);
            System.out.println("Pilih :");
            System.out.println("1. Peminjam");
            System.out.println("2. Admin");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = inputMenu.nextLine();
            switch (menu) {
                case "1":
                    Pinjam pinjam = new Pinjam(username);
                    pinjam.menu();
                    break;
                case "2":
                    Admin admin = new Admin(username);
                    admin.menu();
                    break;
                case "0":
                    status = false;
                    break;
                default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        } while (status != false);
        inputMenu.close();
    }
}
