package tugaspert7;

import java.time.*;

public class Pegawai {
    // ini atributnya
    String id;
    String nama;
    int golongan;
    LocalDate tanggalLahir;

    // ini constructor
    Pegawai(String id, String nama, int golongan, LocalDate tanggalLahir) {
        this.id = id;
        this.nama = nama;
        this.golongan = golongan;
        this.tanggalLahir = tanggalLahir;
    }

    // method menghitung usia
    int hitungUsia() {
        // tanggal hari ini
        LocalDate today = LocalDate.now();
        // hitung selisih
        Period selisih = Period.between(this.tanggalLahir, today);
        return selisih.getYears();
    }

    // method menghitung gaji pokok berdasarkan golongan dan usia
    long hitungGapok() {
        long gapok = 0;
        if (this.golongan == 1) {
            if (this.hitungUsia() < 40) {
                gapok = 3000000;
            } else {
                gapok = 4000000;
            }
        } else if (this.golongan == 2) {
            if (this.hitungUsia() < 40) {
                gapok = 4000000;
            } else {
                gapok = 5000000;
            }
        }
        return gapok;
    }

    // mencetak data pegawai dan gajinya
    void printPegawai() {
        System.out.println("ID Pegawai   : " + this.id);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan     : " + this.golongan);
        System.out.println("Tgl Lahir    : " + this.tanggalLahir);
        System.out.println("Gaji Pokok   : Rp " + this.hitungGapok());
        System.out.println();
    }
}
