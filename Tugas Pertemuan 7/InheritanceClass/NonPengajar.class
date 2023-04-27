package tugaspert7;

import java.time.*;

public class NonPengajar extends Pegawai {
    // constuctor
    NonPengajar(String id, String nama, int golongan, LocalDate tanggalLahir) {
        super(id, nama, golongan, tanggalLahir);
    }

    // menghitung tunjangan Non Pengajar
    long hitungTunjPegawai() {
        long tunjPegawai = 1000000;
        return tunjPegawai;
    }

    // menghitung total gaji
    long hitungTotalGaji() {
        long total = this.hitungGapok() +this.hitungTunjPegawai();
        return total;
    }

    // cetak hasil
    void printPegawai(){
        System.out.println("ID Pegawai   : " + this.id);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan     : " + this.golongan);
        System.out.println("Tgl Lahir    : " + this.tanggalLahir);
        System.out.println("Usia         : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok   : Rp " + this.hitungGapok());
        System.out.println("Tunj Pegawai : Rp " + this.hitungTunjPegawai());
        System.out.println("Total Gaji   : Rp " + this.hitungTotalGaji());
    }
}