package Polymorphism;

/**
 *
 * @author Farrel
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Person
        Person person = new Person("Dadang Nurjaman", "Bojongloa Kaler", "081255554444", "dadang12@gmail.com");

        // Membuat objek Student
        Student student = new Student("Rizky Faturahman", "Cigugur Tengah", "081299993333", "Rizky98@gmail.com", Student.SENIOR);

        // Membuat objek Employee
        MyDate hireDate = new MyDate(17, 5, 2024);
        Employee employee = new Employee("Asep", "Sumur Bandung", "081255552222", "asep34@gmail.com", "101A", 50000, hireDate);

        // Membuat objek Faculty
        Faculty faculty = new Faculty("Eddy", "Dago Pakar", "081288886666", "eddy52@gmail.com", "202B", 70000, hireDate, 10, "Professor");

        // Membuat objek Staff
        Staff staff = new Staff("Kosasih", "Banjaran", "081262628384", "kosasih61@gmail.com", "303C", 40000, hireDate, "Manager");

        // Memanggil metode toString() untuk setiap objek
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
    
}
