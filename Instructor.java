package edu.dvc.comsc256.rs;

public class Instructor {
    private int id;
    private String name;
    private Course[] courses;
    private int size;

    public Instructor(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new Course[10];
        this.size = 0;
    }

    public void addCourse(Course course) {
        ensureCapacity();
        courses[size++] = course;
    }

    private void ensureCapacity() {
        if (size == courses.length) {
            Course[] temp = new Course[courses.length * 2];
            System.arraycopy(courses, 0, temp, 0, courses.length);
            courses = temp;
        }
    }

    public void print() {
        System.out.println("Instructor: " + name);
        System.out.print("Courses: ");
        for (int i = 0; i < size; i++) {
            System.out.print(courses[i].getName() + " ");
        }
        System.out.println("\n");
    }
}