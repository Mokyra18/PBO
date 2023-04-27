public class Staf extends Pegawai {
    public Staf(String id, String nama) {
        super(id, nama);
    }

    @Override
    public void tampilIdentitas() {
        System.out.println("Saya staf dengan NIP " + id + " dan nama " + nama);
    }
}
