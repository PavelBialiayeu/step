package by.belyaev.L10_03_2025;

public class Student {
    private int age;
    private double grade;
    private String name;

    public Student(int age, double grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }
}
