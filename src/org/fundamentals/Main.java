package org.fundamentals;

import org.fundamentals.classes.Courses;
import org.fundamentals.classes.Student;

public class Main {
    public static void main(String[] args) {
        // Crear curso
        Courses course = new Courses("Matematicas", "Fausto Alberto", 2024);

        // Crear estudiantes
        Student student1 = new Student("Miguel", "Valencia", 12345, 65, 1);
        Student student2 = new Student("Cristian", "López", 12346, 79, 1);
        Student student3 = new Student("Carlos", "Valencia", 12347, 95, 1);

        // Inscribir un solo estudiante
        course.enroll(student1);
        
        // Inscribir un arreglo de estudiantes
        Student[] newStudents = {student2, student3};
        course.enroll(newStudents);
        
        // Imprimir el nombre completo de los estudiantes
        for (Student student : newStudents) {
            student.printFullName();
        }
        
        // Contar estudiantes inscritos
        System.out.println("Total de estudiantes inscritos: " + course.countStudents());
        
        // Ver la mejor calificación
        System.out.println("mejor calificación: " + course.bestGrade());
        
        // Cambiar el año si el estudiante está aprobado
        student1.changeYearIfApproved();
        student2.changeYearIfApproved();
        student3.changeYearIfApproved();
    }
}