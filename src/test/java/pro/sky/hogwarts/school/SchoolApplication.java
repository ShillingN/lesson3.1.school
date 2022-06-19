package pro.sky.hogwarts.school;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pro.sky.hogwarts.school.model.Faculty;
import pro.sky.hogwarts.school.model.Student;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@OpenAPIDefinition
public class SchoolApplication {
	private static final List<Faculty> facultyArrayList = new ArrayList<>();
	private static final List<Student> studentArrayList = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);

		facultyArrayList.add(new Faculty(1L, "gryffindor", "red"));
		facultyArrayList.add(new Faculty(2L, "hufflepuff", "orange"));
		facultyArrayList.add(new Faculty(3L, "slytherin", "green"));
		System.out.println(facultyArrayList);

		studentArrayList.add(new Student(1L, "Laryn Petr", 16));
		studentArrayList.add(new Student(2L, "Tanya Grotter", 18));
		studentArrayList.add(new Student(3L, "Senya Doter", 34));
		System.out.println(studentArrayList);
	}
}
