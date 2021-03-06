package dao;

import java.util.List;
import java.util.Map;

import model.Course;
import model.Student;

public interface StudentDao {
	void addNewStudent(Student student);
	void updateStudentProfile(Student student);
	void registration(Student student, Course course);
	Map<Student, Course> viewAllRegistrations();
	Student findStudentByRollNo(int rollNo);
	List<Student> viewAllStudents();
	void addNewCourse(Course course);
	List<Course> viewAllCourses();
}