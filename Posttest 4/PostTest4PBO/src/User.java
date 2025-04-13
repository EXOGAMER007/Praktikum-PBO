import java.util.Scanner;

class User {
  static String username;
  public static Peminjam peminjam = new Peminjam();

  public User(String username) {
    User.username = username;
  }

  void menu() {
    peminjam.setNama(username);
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
    do {

      System.out.println("");
      System.out.println("Selamat datang admin!");
      System.out.println("1. Lihat Peminjam");
      System.out.println("0. keluar");
      System.out.print("Pilih menu: ");
      menu = inputMenu.nextLine();
      switch (menu) {
        case "1":
          peminjam.Peminjaman();
          break;
        case "0":
          menu = "0";
          break;
        default:
          System.out.println("Menu tidak valid");
          break;
      }
    } while (!menu.equals("2"));
  }
}