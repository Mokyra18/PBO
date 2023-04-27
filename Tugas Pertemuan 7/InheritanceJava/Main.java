package tugaspert7;

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
