package Praktikum2.PRAK201_2210817310005_IKHSANGYMNASTIAR;
public class Buah {
    String nama;
    double berat,harga,jumlahbeli, hargasebelumdiskon, totdiskon,hargasetelahdiskon;
    public Buah (String Namabuah, double BeratBuah, double JumlahBeliBuah, double HargaBuah){
        this.nama = Namabuah;
        this.berat = BeratBuah;
        this.harga = HargaBuah;
        this.jumlahbeli = JumlahBeliBuah;
        this.hargasebelumdiskon = HargaBuah * (JumlahBeliBuah / BeratBuah);
        this.totdiskon =(int)(JumlahBeliBuah / 4) * (4 * HargaBuah) * 0.02;
        this.hargasetelahdiskon = hargasebelumdiskon - totdiskon;
    }
    public void Infobuah(){
        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + berat );
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlahbeli + " kg");
        System.out.println("Harga Sebelum Diskon: Rp." + hargasebelumdiskon);
        System.out.println("Total Diskon: Rp." + totdiskon);
        System.out.println("Harga Setelah Diskon: Rp." + hargasetelahdiskon);
        System.out.println();
    }
}



