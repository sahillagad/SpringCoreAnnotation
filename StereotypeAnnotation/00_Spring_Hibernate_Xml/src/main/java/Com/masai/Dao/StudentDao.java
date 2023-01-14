package Com.masai.Dao;

import java.util.List;

import Com.masai.entity.Student;

public interface StudentDao {
	
	

	public String addStudent(Student s);
	public String updateStudent(Student s);
	public List<Student> listPersons();
	public Student getStudentById(int roll);
	public String removeStudent(int roll);

}
