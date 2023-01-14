package Com.masai.Service;

import java.util.List;

import Com.masai.entity.Student;

public interface StudentService {


	public void addStudent(Student s);
	public void updateStudent(Student s);
	public void listPersons();
	public void getStudentById(int roll);
	public void removeStudent(int roll);

}
