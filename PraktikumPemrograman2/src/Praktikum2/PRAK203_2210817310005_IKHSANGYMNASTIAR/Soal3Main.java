package Praktikum2.PRAK203_2210817310005_IKHSANGYMNASTIAR;

public class Soal3Main {
    public static void main(String[] args){
        Pegawai p1 = new Pegawai();
        //Pada baris ke-7 terjadi error karena kurang tanda titik koma (;) diakhir
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        //Pada baris ke-11 terjadi error karena deklarasi tidak sesuai dengan yang ada pada class Pegawai, jadi ditambahkan method setJabatan
        //p1.jabatan = "Assasin";
        p1.setJabatan ("Assasin");
        //Belum terdapat pendeklarasian pada property umur
        p1.umur = 17;

        //Pada baris ke-17, output yang diperlukan adalah "Nama: Roi", jadi kata Pegawai dihapus saja
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Pada baris ke-22 kurang kata untuk mencetak kata tahun diakhir kalimat, jadi tambahkan (+ " tahun")
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}

