package Project;

import java.util.Scanner;

public class TokoSepeda12 {

    public static void main(String[] args) {
        Scanner fandy = new Scanner(System.in);
        Scanner wahyu = new Scanner(System.in);
        Scanner hanzura = new Scanner(System.in);
        String pilihan12, nama12 = null, alamat12 = null;
        int No12 = 0, jumlah12 = 0, masa12 = 0, cuti12 = 0, sepeda12, tunjangan12 = 0, poCut12 = 0, totalGajiI12 = 0, hasilKomisi12 = 0;
        double komisi12 = 0.0, totalGaji12 = 0, cutiDol12 = 0;
        cutiDol12 = (int) cuti12;
        totalGajiI12 = (int) totalGaji12;
        sepeda12 = 1500000;
        boolean Iscontinue12 = true;
        System.out.println("===UTS Praktikum Dasar Pemrograman TI-1G===");
        System.out.println("dibuat oleh : Fandy Wahyu Hanzura");
        System.out.println("NIM         : 2341720165");
        System.out.println("============================================\n");
        while (Iscontinue12) {
            System.out.println("pilih menu: ");
            System.out.println("1. Data karyawan");
            System.out.println("2. Gaji karyawan");
            System.out.println("Menu: ");
            pilihan12 = fandy.nextLine();
            switch (pilihan12) {
                case ("1"):
                    System.out.println("Masukan data karyawan");
                    System.out.print("Nama: ");
                    nama12 = fandy.nextLine();
                    System.out.print("alamat: ");
                    alamat12 = fandy.nextLine();
                    System.out.print("NoHp: ");
                    No12 = wahyu.nextInt();
                    System.out.print("Jumlah penjualan sepeda: ");
                    jumlah12 = wahyu.nextInt();
                    jumlah12 *= 1500000;
                    if (jumlah12 == 3000000) {
                        komisi12 = 0.02 * jumlah12;
                    } else if (jumlah12 >= 3000000 && jumlah12 <= 5000000) {
                        komisi12 = 0.05 * jumlah12;
                    } else if (jumlah12 >= 5000000 && jumlah12 <= 10000000) {
                        komisi12 = 0.07 * jumlah12;
                    } else if (jumlah12 >= 10000000) {
                        komisi12 = 0.1 * jumlah12;
                    }
                    System.out.print("masa kerja: ");
                    masa12 = wahyu.nextInt();
                    if (masa12 <= 3) {
                        tunjangan12 = 0;
                    } else if (masa12 >= 3 && masa12 <= 5) {
                        tunjangan12 = 1000000;
                    } else if (masa12 >= 6 && masa12 <= 8) {
                        tunjangan12 = 2000000;
                    } else if (masa12 >= 8) {
                        tunjangan12 = 3000000;
                    }
                    System.out.print("Jumlah cuti: ");
                    cuti12 = wahyu.nextInt();
                    System.out.println("apakah anda ingin mencetak data karyawan (y/t)");
                    pilihan12 = fandy.nextLine();
                    if (pilihan12.equalsIgnoreCase("y")) {
                        System.out.println("nama : " + nama12);
                        System.out.println("nama : " + alamat12);
                        System.out.println("NoHp : " + No12);
                        System.out.println("Jumlah penjualan sepeda " + jumlah12 + " sepeda");
                        System.out.println("Masa kerja : " + masa12 + " Tahun");
                        System.out.println("lama cuti : " + cuti12 + " hari");
                    }
                    System.out.println("kembali ke menu: (y/t)");
                    pilihan12 = fandy.nextLine();
                    if (pilihan12.equalsIgnoreCase("t")) {
                        Iscontinue12 = false;
                    }
                    break;
                case ("2"):
                    if (nama12 != null || alamat12 != null) {
                        System.out.println("======================");
                        System.out.println("data karyawan");
                        System.out.println("======================");
                        System.out.println("nama : " + nama12);
                        System.out.println("komisi penjualan: " + komisi12);
                        System.out.println("tunjangan: " + tunjangan12);
                        totalGaji12 = (int) komisi12 + tunjangan12 - (cuti12 * 35000);
                        poCut12 = cuti12 * 35000;
                        System.out.println("potongan cuti: " + poCut12);
                        System.out.println("gaji yang diterima: " + totalGaji12);
                        System.out.println("kembali ke menu: (y/t)");
                        pilihan12 = hanzura.nextLine();
                        if (pilihan12.equalsIgnoreCase("y")) {
                            Iscontinue12 = true;
                            break;
                        }
                    }
                    System.out.println("masukan data karyawan terlebih dahulu");
                    System.out.println("kembali ke menu: (y/t)");
                    pilihan12 = fandy.nextLine();
                    if (pilihan12.equalsIgnoreCase("t")) {
                        Iscontinue12 = false;
                    }
                    break;
            }
        }
    }
}
