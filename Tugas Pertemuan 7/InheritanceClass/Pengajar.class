package tugaspert7;

import java.time.*;

public class Pengajar extends Pegawai {
    // atribut tambahan
    String nip;

    // constructor
    Pengajar(String id, String nama, int golongan, LocalDate tanggalLahir, String nip) {
        super(id, nama, golongan, tanggalLahir);
        this.nip = nip;
    }

    // menghitung tunjangan pengawai Pengajar
    long hitungTunjPegawai() {
        long tunjPegawai = 1200000;
        return tunjPegawai;
    }

    // menghitung tunjangan fungsional Pengajar
    long hitungTunjFungsional() {
        long tunjFungsional;
        if (this.hitungUsia() < 40) {
            tunjFungsional = 1500000;
        } else {
            tunjFungsional = 1800000;
        }
        return tunjFungsional;
    }

    // menghitung total gaji
    long hitungTotalGaji() {
        long total = this.hitungGapok() + this.hitungTunjPegawai() + hitungTunjFungsional();
        return total;
    }

    //cetak hasil
    void printPegawai(){
        System.out.println("ID Pegawai   : " + this.id);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan     : " + this.golongan);
        System.out.println("Tgl Lahir    : " + this.tanggalLahir);
        System.out.println("NIP          : " + this.nip);
        System.out.println("Usia         : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok   : Rp " + this.hitungGapok());
        System.out.println("Tunj Pegawai : Rp " + this.hitungTunjPegawai());
        System.out.println("Tunj Fungsi  : Rp " + this.hitungTunjFungsional());
        System.out.println("Total Gaji   : Rp " + this.hitungTotalGaji());
        System.out.println();
    }
}
