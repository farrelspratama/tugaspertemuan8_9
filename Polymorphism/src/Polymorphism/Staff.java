package Polymorphism;

/**
 *
 * @author Farrel
 */
public class Staff extends Employee {
    private String gelar;

    public Staff(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, MyDate tanggalBekerja, String gelar) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalBekerja);
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return "Class: Staff, Nama: " + nama;
    }
}
