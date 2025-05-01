import java.util.Scanner;

public final class Peminjam {
  private String nama;
  private String namaSementara;
  private float jumlahPinjaman;
  Scanner input = new Scanner(System.in);
  Pinjaman pinjaman = new Pinjaman();

  public final String GetNama() { // Getter
    return nama;
  }

  public final void setNama(String nama) {
    this.nama = nama;
  }

  void Peminjaman() {
    pinjaman.lihatPinjaman();
  }

  void Peminjaman(int pilihan, String Jenis) {
    if (Jenis.equals("Setujui")) {
      pinjaman.SetujuiPinjaman(pilihan);
    }
  }

  void Peminjaman(int pilihan) {
    System.out.println("");
    int menu;
    int menu2;
    float menu3;
    try {

      switch (pilihan) {
        case 1:
          System.out.println("Atas nama siapa?");
          namaSementara = input.nextLine();
          System.out.print("Masukkan jumlah pinjaman: ");
          jumlahPinjaman = Float.parseFloat(input.nextLine());
          pinjaman.tambahPinjaman(jumlahPinjaman, namaSementara);
          break;
        case 2:
          pinjaman.lihatPinjaman();
          break;
        case 3:
          pinjaman.lihatPinjaman();
          System.out.print("Pilih pinjaman yang akan dihapus: ");
          menu = Integer.parseInt(input.nextLine());
          System.out.println("");
          pinjaman.lihatPinjaman(menu - 1);
          System.out.print("Apakah Anda yakin ingin menghapus pinjaman ke-" + menu + "?[1/0] :");
          menu2 = Integer.parseInt(input.nextLine());
          if (menu2 == 1) {
            pinjaman.hapusPinjaman(menu - 1);
          }
          break;
        case 4:
          pinjaman.lihatPinjaman();
          System.out.print("Pilih pinjaman yang akan di edit: ");
          menu = input.nextInt();
          pinjaman.lihatPinjaman(menu - 1);
          System.out.print("Mau mengedit berapa? : ");
          menu3 = input.nextInt();
          pinjaman.editPinjaman(menu - 1, menu3);
          break;
        default:
          break;
      }
    } catch (Exception e) {
      System.out.println("");
      System.out.println("Input tidak valid");
    }
  }

}