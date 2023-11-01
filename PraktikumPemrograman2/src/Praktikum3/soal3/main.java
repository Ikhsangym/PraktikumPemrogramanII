package Praktikum3.soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scan.nextInt();

            if (pilihan == 0) {
                mahasiswaList.clear();
                System.out.println("Terimakasih!");
                break;
            } else if (pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                scan.nextLine();
                String nama = scan.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = scan.nextLine();

                boolean nimada = false;
                for (Mahasiswa mahasiswa : mahasiswaList) {
                    if (mahasiswa.getNim().equals(nim)) {
                        nimada = true;
                        break;
                    }
                }

                if (nimada) {
                    System.out.println("NIM sudah digunakan.");
                } else {
                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                    mahasiswaList.add(mahasiswa);
                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nim = scan.next();

                boolean nimnya = false;
                for (Mahasiswa mahasiswa : mahasiswaList) {
                    if (mahasiswa.getNim().equals(nim)) {
                        nimnya = true;
                        mahasiswaList.remove(mahasiswa);
                        System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                        break;
                    }
                }

                if (!nimnya) {
                    System.out.println("NIM tidak ditemukan.");
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                String nim = scan.next();

                boolean Nimnya = false;
                for (Mahasiswa mahasiswa : mahasiswaList) {
                    if (mahasiswa.getNim().equals(nim)) {
                        Nimnya = true;
                        System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
                        break;
                    }
                }
                if (!Nimnya) {
                    System.out.println("NIM tidak ditemukan.");
                }
            } else if (pilihan == 4) {
                System.out.println("Daftar Mahasiswa:");
                for (Mahasiswa mahasiswa : mahasiswaList) {
                    System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
                }
            } else {
                System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        }
    }
}
