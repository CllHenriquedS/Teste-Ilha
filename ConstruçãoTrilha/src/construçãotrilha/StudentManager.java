package construçãotrilha;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String name, int id, int age, String course) {
        Student student = new Student(name, id, age, course);
        students.add(student);
    }

    public void listStudents() {
        System.out.println("\nList of Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

