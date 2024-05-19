package Polymorphism;

/**
 *
 * @author Farrel
 */
public class Faculty extends Employee {
    private int waktuBekerja;
    private String posisi;

    public Faculty(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, MyDate tanggalBekerja, int kantorHours, String posisi) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalBekerja);
        this.waktuBekerja = waktuBekerja;
        this.posisi = posisi;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Nama: " + nama;
    }
}
