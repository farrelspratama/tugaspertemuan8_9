package Polymorphism;

/**
 *
 * @author Farrel
 */
public class Student extends Person {
    public static final String MAHASISWABARU = "mahasiswa baru";
    public static final String MAHASISWATAHUNKEDUA = "mahasiswa tahun kedua";
    public static final String JUNIOR = "junior";
    public static final String SENIOR = "senior";

    private String status;

    public Student(String nama, String alamat, String nomorTelepon, String email, String status) {
        super(nama, alamat, nomorTelepon, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Nama: " + nama;
    }
}
