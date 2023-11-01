package Praktikum3.soal2;

import java.util.*;

public class Negara {
    private String namanegara, jenispemimpin, namapemimpin;
    private int tanggal, bulan, tahun;

    public Negara(String nama, String jenis, String nama_p, int tanggal, int bulan, int tahun){
        this.namanegara = nama;
        this.jenispemimpin = jenis;
        this.namapemimpin = nama_p;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }
    public int getBulan(){
        return bulan;
    }

    void getData(){
        Scanner scan = new Scanner(System.in);
        namanegara = scan.nextLine();
        jenispemimpin = scan.nextLine();
        namapemimpin = scan.nextLine();
        if (jenispemimpin.equalsIgnoreCase("presiden")|| jenispemimpin.equalsIgnoreCase("perdana menteri")) {
            tanggal = scan.nextInt();
            bulan = scan.nextInt();
            tahun = scan.nextInt();
        }
    }

    void tampilkan(){
        HashMap<Integer, String> month = new HashMap<Integer,String>();
        month.put(1, "Januari");
        month.put(2, "Februari");
        month.put(3, "Maret");
        month.put(4, "April");
        month.put(5, "Mei");
        month.put(6, "Juni");
        month.put(7, "Juli");
        month.put(8, "Agustus");
        month.put(9, "September");
        month.put(10, "Oktober");
        month.put(11, "November");
        month.put(12, "Desember");
        if (jenispemimpin.equalsIgnoreCase("presiden")|| jenispemimpin.equalsIgnoreCase("perdana menteri")) {
            System.out.println("Negara "+ namanegara +" mempunyai "+ jenispemimpin +" bernama "+ namapemimpin);}
        else if (jenispemimpin.equalsIgnoreCase("monarki")){
            System.out.println("Negara "+ namanegara +" mempunyai Raja"+" bernama "+ namapemimpin +"\n");}
        if (jenispemimpin.equalsIgnoreCase("presiden")|| jenispemimpin.equalsIgnoreCase("perdana menteri")) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal "+tanggal+" "+month.get(getBulan())+" "+tahun+"\n");}
    }
}