import java.util.Scanner;

abstract class User {
  static String username;
  public static Peminjam peminjam = new Peminjam();
  final String password = "123456";

  public User(String username) {
    User.username = username;
  }

  public abstract void menu();
}

class Pinjam extends User {
  String username;

  public Pinjam(String username) {
    super(username);
    this.username = username;
  }

  @Override
  public void menu() {
    // Peminjam peminjam = new Peminjam(username);
    String menu = null;
    Scanner inputMenu = new Scanner(System.in);
    peminjam.setNama(username);

    do {
      System.out.println("");
      System.out.println("Selamat datang di aplikasi peminjaman! ");
      System.out.println("Halo " + peminjam.GetNama() + "!");
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
          System.out.println("Menu tidak valid");
          break;
      }
    } while (menu != "0");
  }
}

class Admin extends User {
  public Admin(String username) {
    super(username);
    User.username = username;
  }

  @Override
  public void menu() {
    String menu = null;
    Scanner inputMenu = new Scanner(System.in);
    System.out.print("Masukkan password: ");
    String pass = inputMenu.nextLine();
    if (!pass.equals(password)) {
      System.out.println("Password salah!");
      return;
    }
    do {

      System.out.println("");
      System.out.println("Selamat datang admin!");
      System.out.println("1. Lihat Peminjam");
      System.out.println("2. Setujui Peminjaman");
      System.out.println("0. keluar");
      System.out.print("Pilih menu: ");
      menu = inputMenu.nextLine();
      switch (menu) {
        case "1":
          peminjam.Peminjaman();
          break;
        case "2":
          peminjam.Peminjaman();
          System.out.print("Pilih pinjaman yang akan disetujui: ");
          int pilih = Integer.parseInt(inputMenu.nextLine());
          String Jenis = "Setujui";
          peminjam.Peminjaman(pilih - 1, Jenis);
          break;
        case "0":
          menu = "0";
          break;
        default:
          System.out.println("Menu tidak valid");
          break;
      }
    } while (!menu.equals("0"));
  }
}