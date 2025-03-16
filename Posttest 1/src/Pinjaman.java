import java.util.ArrayList;

public class Pinjaman {
  float jumlahPinjaman;
  int batasWaktu;
  int status;
  ArrayList<Float> pinjaman = new ArrayList<>();
  ArrayList<String> pengajuan = new ArrayList<>();

  void tambahPinjaman(float jumlahPinjaman) {
    pinjaman.add(jumlahPinjaman);
    pengajuan.add("Menunggu");
    lihatPinjaman();
  }

  void hapusPinjaman(int index) {
    pinjaman.remove(index);
    pengajuan.remove(index);
  }

  void editPinjaman(int index, float jumlahPinjaman) {
    pinjaman.set(index, jumlahPinjaman);
  }

  void lihatPinjaman() {
    System.out.println("");
    System.out.println("Daftar pengajuan Peminjaman ");
    for (int i = 0; i < pinjaman.size(); i++) {
      System.out.println("Peminjaman ke-" + (i + 1) + ": " + pinjaman.get(i));
      System.out.println("Status :" + pengajuan.get(i));
      System.out.println("");
    }
  }

  void lihatSatu(int index) {
    System.out.println("Peminjaman ke-" + (index + 1) + ": " + pinjaman.get(index));
    System.out.println("Status :" + pengajuan.get(index));
    System.out.println("");
  }
}
