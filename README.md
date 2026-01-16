# Student Management System (Java)

A console-based **Student Management System** implemented in Java that models real-world academic relationships between **students, courses, and instructors** using object-oriented programming principles.

This project was developed as part of a coursework assignment and later polished for clarity, structure, and GitHub presentation.

---

##  Features

- Create and manage **Students**, **Courses**, and **Instructors**
- Enroll and drop students from courses
- Assign instructors to multiple courses
- Track student course enrollments
- Dynamically resize internal data structures as limits are reached
- Display formatted summaries for students, courses, and instructors

---

##  Core Concepts Demonstrated

- Object-Oriented Programming (OOP)
- Classes and object relationships (association)
- Encapsulation and data hiding
- Dynamic array resizing
- Constructor overloading
- Traversal, insertion, and deletion
- Console-based output formatting

---

##  Project Structure
src/

└── edu/dvc/comsc256/rs/

├── StudentTest.java // Main driver program

├── Course.java // Course model

├── Instructor.java // Instructor model

└── Student.java // Student model

---

##  How to Run

1. Compile all `.java` files:
   ```bash
   javac edu/dvc/comsc256/rs/*.java
   ```
2. Run the main program:
   ```
   java edu.dvc.comsc256.rs.Assignment1

##  Output

The program demonstrates:

Adding and removing students

Assigning instructors to courses

Printing formatted summaries of all entities

Output is displayed directly in the console.

##  Future Improvements

Replace arrays with ArrayList

Add persistence using file or database storage

Implement a menu-driven UI

Add validation and exception handling

Introduce interfaces for extensibility

##  Author

Rishit Srinivas

Computer Science Student

San José State University
