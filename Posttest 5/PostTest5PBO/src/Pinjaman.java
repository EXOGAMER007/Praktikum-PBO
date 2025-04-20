import java.util.ArrayList;

public final class Pinjaman {
  protected float jumlahPinjaman;
  protected final int batasPinjaman = 5;
  protected int status;
  ArrayList<String> nama = new ArrayList<>();
  ArrayList<Float> pinjaman = new ArrayList<>();
  ArrayList<String> pengajuan = new ArrayList<>();

  void tambahPinjaman(float jumlahPinjaman, String namaPeminjam) {
    nama.add(namaPeminjam);
    pinjaman.add(jumlahPinjaman);
    pengajuan.add("Menunggu");
    lihatPinjaman();
  }

  void hapusPinjaman(int index) {
    pinjaman.remove(index);
    pengajuan.remove(index);
    nama.remove(index);
  }

  void editPinjaman(int index, float jumlahPinjaman) {
    pinjaman.set(index, jumlahPinjaman);
  }

  void SetujuiPinjaman(int index) {
    pengajuan.set(index, "Disetujui");
  }

  void lihatPinjaman() {
    System.out.println("");
    System.out.println("Daftar pengajuan Peminjaman ");
    for (int i = 0; i < pinjaman.size(); i++) {
      System.out.println("Peminjaman ke-" + (i + 1) + ": " + pinjaman.get(i));
      System.out.println("Atas nama : " + nama.get(i));
      System.out.println("Status :" + pengajuan.get(i));
      System.out.println("");
    }
  }

  void lihatPinjaman(int index) {
    System.out.println("Peminjaman ke-" + (index + 1) + ": " + pinjaman.get(index));
    System.out.println("Atas nama : " + nama.get(index));
    System.out.println("Status :" + pengajuan.get(index));
    System.out.println("");
  }
}
