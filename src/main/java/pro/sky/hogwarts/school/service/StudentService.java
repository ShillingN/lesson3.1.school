package pro.sky.hogwarts.school.service;

import pro.sky.hogwarts.school.model.Student;

import java.util.Set;

public interface StudentService {
    Student createStudent(Student student);

    Student findStudent(Long id);

    Student updateStudent(Student student);

    Student deleteStudent(Long id);

    Set<Student> findStudentByAge(int age);

    Set<Student> allStudents();
}
