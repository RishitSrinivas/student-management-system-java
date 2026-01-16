package edu.dvc.comsc256.rs;

public class Student {
    private int id;
    private String name;
    private Course[] courses;
    private int size;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new Course[10];
        this.size = 0;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        ensureCapacity();
        courses[size++] = course;
    }

    public void dropCourse(Course course) {
        for (int i = 0; i < size; i++) {
            if (courses[i] == course) {
                courses[i] = courses[size - 1];
                courses[--size] = null;
                return;
            }
        }
    }

    private void ensureCapacity() {
        if (size == courses.length) {
            Course[] temp = new Course[courses.length * 2];
            System.arraycopy(courses, 0, temp, 0, courses.length);
            courses = temp;
        }
    }

    public void print() {
        System.out.println("Student: " + name);
        System.out.print("Courses: ");
        for (int i = 0; i < size; i++) {
            System.out.print(courses[i].getName() + " ");
        }
        System.out.println();
    }
}