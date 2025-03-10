package by.belyaev.L10_03_2025;

import java.util.*;

public class Task00 {
    public static void main(String[] args) {
        Student student1 = new Student(20, 7, "Петя");
        Student student2 = new Student(22, 9, "Аня");
        Student student3 = new Student(19, 5, "Андрей");


        Map<Integer, Student> mapAgeToStudent = new HashMap<>();
        mapAgeToStudent.put(student1.getAge(), student1);
        mapAgeToStudent.put(student2.getAge(), student2);
        mapAgeToStudent.putIfAbsent(student3.getAge(), student3);
        Student student = mapAgeToStudent.get(22);
        boolean containsStudent2 = mapAgeToStudent.containsValue(student2);
        Set<Integer> ages = mapAgeToStudent.keySet();
        System.out.println(mapAgeToStudent);


        for (Map.Entry<Integer, Student> entry : mapAgeToStudent.entrySet()) {
            Student value = entry.getValue();
            Integer key = entry.getKey();
            System.out.println(key);
            System.out.println(value);
        }

        mapAgeToStudent.getOrDefault(90, new Student(18, 3, "Саша"));
        mapAgeToStudent.remove(34);

        Map<Integer, List<Student>> ageStudentsMap = new HashMap<>();
        List<Student> students = new ArrayList<>();
        students.add(student1);
        ageStudentsMap.put(student1.getAge(), students);
        List<Student> students1 = ageStudentsMap.get(student1.getAge());
        students1.add(student2);

        List<Student> studentsList = List.of(student1, student2, student3);
        for (Student s : studentsList) {
            ageStudentsMap.putIfAbsent(s.getAge(), new ArrayList<>());
            List<Student> list = ageStudentsMap.get(s.getAge());
            list.add(s);

        }
        System.out.println(ageStudentsMap);
    }
}