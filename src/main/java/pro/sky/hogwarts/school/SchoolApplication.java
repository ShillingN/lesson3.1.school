//package pro.sky.hogwarts.school;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import pro.sky.hogwarts.school.data.Faculty;
//import pro.sky.hogwarts.school.data.Student;
//
//import java.util.ArrayList;
//
//@SpringBootApplication
//public class SchoolApplication {
//	private static final ArrayList<Faculty> facultyArrayList = new ArrayList<>();
//	private static final ArrayList<Student> studentArrayList = new ArrayList<>();
//
//	public static void main(String[] args) {
//		SpringApplication.run(SchoolApplication.class, args);
//
//		facultyArrayList.add(new Faculty(1l, "gryffindor", "red"));
//		facultyArrayList.add(new Faculty(2l, "hufflepuff", "orange"));
//		facultyArrayList.add(new Faculty(3l, "slytherin", "green"));
//		System.out.println(facultyArrayList);
//
////		final ArrayList<Student> studentArrayList;
////		studentArrayList = new ArrayList<>();
//		studentArrayList.add(new Student(1l, "Laryn Petr", 16));
//		studentArrayList.add(new Student(2l, "Tanya Grotter", 18));
//		studentArrayList.add(new Student(3l, "Senya Doter", 34));
//		System.out.println(studentArrayList);
//	}
//}
