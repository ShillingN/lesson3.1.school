package pro.sky.hogwarts.school.service;

import org.springframework.stereotype.Service;
import pro.sky.hogwarts.school.exception.StudentAlreadyOnTheMapException;
import pro.sky.hogwarts.school.exception.StudentNotFoundException;
import pro.sky.hogwarts.school.model.Student;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService{
    private long generateStudentId = 0;
    private final Map<Long, Student> studentMap;

    public StudentServiceImpl() {
        this.studentMap = new HashMap<>();
    }

    @Override
    public Student createStudent(Student student) {
        if (studentMap.containsValue(student)) {
            throw new StudentAlreadyOnTheMapException();
        }
        student.setId(++generateStudentId);
        studentMap.put(generateStudentId, student);
        return student;
    }

    @Override
    public Student findStudent(Long id) {
        if (studentMap.containsKey(id)) {
            return studentMap.get(id);
        }
        throw new StudentNotFoundException();
    }

    @Override
    public Student updateStudent(Student student) {
        if (studentMap.containsKey(student.getId())) {
            return studentMap.put(student.getId(), student);
        }
        throw new StudentNotFoundException();
    }

    @Override
    public Student deleteStudent(Long id) {
        if (studentMap.containsKey(id)) {
            return studentMap.remove(id);
        }
        throw new StudentNotFoundException();
    }

    @Override
    public Set<Student> allStudents() {
        return new HashSet<>(studentMap.values());
    }

    @Override
    public Set<Student> findStudentByAge(int age) {
        return allStudents().stream()
                .filter(student -> student.getAge() == age)
                .collect(Collectors.toSet());
    }


}
