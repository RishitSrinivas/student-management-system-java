package edu.dvc.comsc256.rs;

public class StudentTest {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor(1001, "David Lai");
        Instructor instructor2 = new Instructor(1002, "Walter White");

        Course course1 = new Course("COMSC 260", instructor1);
        Course course2 = new Course("COMSC 210", instructor1);
        Course course3 = new Course("COMSC 110", instructor2);

        instructor1.addCourse(course1);
        instructor1.addCourse(course2);
        instructor2.addCourse(course3);

        Student[] students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(5001 + i, "Student " + (i + 1));
        }

        for (int i = 0; i < 10; i++) {
            course1.addStudent(students[i]);
            course2.addStudent(students[i + 10]);
            course3.addStudent(students[i]);
        }

        course1.dropStudent(students[1]);
        course1.dropStudent(students[2]);
        course1.dropStudent(students[3]);

        course1.addStudent(students[10]);
        course1.addStudent(students[11]);

        course1.print();
        course2.print();
        course3.print();

        instructor1.print();
        instructor2.print();

        for (Student s : students) {
            s.print();
        }
    }
}