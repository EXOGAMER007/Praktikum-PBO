import java.util.Scanner;

public class Peminjam {
  private String nama;
  private String namaSementara;
  private float jumlahPinjaman;
  Scanner input = new Scanner(System.in);
  Pinjaman pinjaman = new Pinjaman();

  public String GetNama() { // Getter
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  void Peminjaman() {
    pinjaman.lihatPinjaman();
  }

  void Peminjaman(int pilihan) {
    System.out.println("");
    int menu;
    int menu2;
    float menu3;
    switch (pilihan) {
      case 1:
        System.out.println("Atas nama siapa?");
        namaSementara = input.nextLine();
        System.out.print("Masukkan jumlah pinjaman: ");
        jumlahPinjaman = input.nextFloat();
        pinjaman.tambahPinjaman(jumlahPinjaman, namaSementara);
        break;
      case 2:
        pinjaman.lihatPinjaman();
        break;
      case 3:
        pinjaman.lihatPinjaman();
        System.out.print("Pilih pinjaman yang akan dihapus: ");
        menu = input.nextInt();
        System.out.println("");
        pinjaman.lihatPinjaman(menu - 1);
        System.out.print("Apakah Anda yakin ingin menghapus pinjaman ke-" + menu + "?[1/0] :");
        menu2 = input.nextInt();
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
  }

}