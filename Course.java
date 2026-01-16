package edu.dvc.comsc256.rs;

public class Course {
    private String name;
    private Instructor instructor;
    private Student[] students;
    private int size;

    public Course(String name, Instructor instructor) {
        this.name = name;
        this.instructor = instructor;
        this.students = new Student[10];
        this.size = 0;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        ensureCapacity();
        students[size++] = student;
        student.addCourse(this);
    }

    public void dropStudent(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i] == student) {
                students[i] = students[size - 1];
                students[--size] = null;
                student.dropCourse(this);
                return;
            }
        }
    }

    private void ensureCapacity() {
        if (size == students.length) {
            Student[] temp = new Student[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
    }

    public void print() {
        System.out.println("Course: " + name);
        System.out.print("Students: ");
        for (int i = 0; i < size; i++) {
            System.out.print(students[i].getName() + " ");
        }
        System.out.println("\n");
    }
}