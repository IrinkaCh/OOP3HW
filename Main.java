import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("Григорьев", LocalDate.of(1995, 5, 30), 4.1f));
        listStudents.add(new Student("Александров", LocalDate.of(1993, 10, 10), 3.8f));
        listStudents.add(new Student("Федяев", LocalDate.of(1996, 7, 6), 3.0f));
        listStudents.add(new Student("Муравьева", LocalDate.of(1993, 1, 25), 4.1f));
        listStudents.add(new Student("Гавинова", LocalDate.of(1994, 12, 15), 5.0f));

        StudentGroup studentGroup = new StudentGroup(listStudents);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
    }
}