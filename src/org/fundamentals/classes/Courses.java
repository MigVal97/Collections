package org.fundamentals.classes;
import java.util.ArrayList;

public class Courses {
    String courseName;
    String professorName;
    int year;
    ArrayList<Student> enrolledStudents;

    // Constructor
    public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.enrolledStudents = new ArrayList<>();
    }

    // Método para inscribir a un estudiante
    public void enroll(Student student) {
        enrolledStudents.add(student);
    }

    // Método para inscribir a un arreglo de estudiantes
    public void enroll(Student[] students) {
        for (Student student : students) {
            enrolledStudents.add(student);
        }
    }

    // Método para desinscribir a un estudiante
    public int unEnroll(Student student) {
        enrolledStudents.remove(student);
		return year;
    }

    // Método para contar estudiantes
    public int countStudents() {
        return enrolledStudents.size();
    }

    // Método para obtener la mejor calificación
    public int bestGrade() {
        int best = 0;
        for (Student student : enrolledStudents) {
            if (student.grade > best) {
                best = student.grade;
            }
        }
        return best;
    }
}