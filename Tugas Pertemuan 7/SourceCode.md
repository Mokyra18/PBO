# Tugas Implementasi Inherintance dan Asbtrak Pada Java Pertemuan 7

## Inheritance
implementasi inheritance pada bahasa java
### Class Main
```java
import java.time.*;

public class Main {
    public static void main(String[] args) {
        // contoh data pegawai
        Pegawai p1 = new Pegawai("P1", "Abdul", 1, LocalDate.of(1980, 8, 3));
        p1.printPegawai();
        //contoh data pengajar
        Pengajar p2 = new Pengajar("P2", "Budi", 2, LocalDate.of(1999, 2, 1), "2443");
        p2.printPegawai();
        //contoh data non pengajar
        NonPengajar p3 = new NonPengajar("P03", "centia", 1, LocalDate.of(2002, 1, 25));
        p3.printPegawai();
    }
}
```
### Class Pegawai
```java
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
```
### Class  NonPengajar
```java
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
```
### Class Pengajar
```java
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
```
## Abstract
implementasi abstract pada bahasa java
### Class Main
```java
public class Main {
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("010101", "Jeri");
        mahasiswa.tampilIdentitas();

        // Membuat objek dosen
        Dosen dosen = new Dosen("020202", "Heri");
        dosen.tampilIdentitas();

        // Membuat objek staf
        Staf staf = new Staf("030303", "Tio");
        staf.tampilIdentitas();
    }
}
```
### Class Pegawai
```java
public abstract class Pegawai {
    protected String id;
    protected String nama;

    public Pegawai(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public abstract void tampilIdentitas();
}
```
### Class Mahasiswa
```java
public class Mahasiswa extends Pegawai {
    public Mahasiswa(String id, String nama) {
        super(id, nama);
    }

    @Override
    public void tampilIdentitas() {
        System.out.println("Saya mahasiswa dengan NIM " + id + " dan nama " + nama);
    }
}
```
### Class Dosen
```java
public class Dosen extends Pegawai {
    public Dosen(String id, String nama) {
        super(id, nama);
    }

    @Override
    public void tampilIdentitas() {
        System.out.println("Saya dosen dengan NIDN " + id + " dan nama " + nama);
    }
}
```
### Class Staf
```java
public class Staf extends Pegawai {
    public Staf(String id, String nama) {
        super(id, nama);
    }

    @Override
    public void tampilIdentitas() {
        System.out.println("Saya staf dengan NIP " + id + " dan nama " + nama);
    }
}
```
