package Praktikum2.PRAK202_2210817310005_IKHSANGYMNASTIAR;
public class Kopi {
    String namaKopi, ukuran, pembeli;
    double harga;

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }
    public String getPembeli() {
        return this.pembeli;
    }
    public double getPajak() {
        double pajak = 0.11 * harga;
        return pajak;
    }
    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }
}

