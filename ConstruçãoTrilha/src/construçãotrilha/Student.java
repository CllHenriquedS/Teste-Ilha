package construçãotrilha;

public class Student {
    private String name;
    private int id;
    private int age;
    private String course;

    public Student(String name, int id, int age, String course) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}

