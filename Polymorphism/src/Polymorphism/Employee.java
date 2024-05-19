package Polymorphism;

/**
 *
 * @author Farrel
 */
public class Employee extends Person {
    protected String kantor;
    protected double gaji;
    protected MyDate tanggalBekerja;

    public Employee(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, MyDate tanggalBekerja) {
        super(nama, alamat, nomorTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalBekerja = tanggalBekerja;
    }

    @Override
    public String toString() {
        return "Class: Employee, Nama: " + nama;
    }
}
