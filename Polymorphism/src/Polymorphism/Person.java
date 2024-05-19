package Polymorphism;

/**
 *
 * @author Farrel
 */
public class Person {
    protected String nama;
    protected String alamat;
    protected String nomorTelepon;
    protected String email;

    public Person() {
    }

    public Person(String nama, String alamat, String nomorTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Class: Person, Nama: " + nama;
    }
}
