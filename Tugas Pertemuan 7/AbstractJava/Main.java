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
