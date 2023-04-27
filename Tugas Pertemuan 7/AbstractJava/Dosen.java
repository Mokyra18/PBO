public class Dosen extends Pegawai {
    public Dosen(String id, String nama) {
        super(id, nama);
    }

    @Override
    public void tampilIdentitas() {
        System.out.println("Saya dosen dengan NIDN " + id + " dan nama " + nama);
    }
}
