package Com.masai.Service;

import java.util.List;

import Com.masai.Dao.StudentDao;
import Com.masai.entity.Student;

public class StudentServiceImpl implements StudentService{

	
	StudentDao dao;
	
	
	
	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	public void addStudent(Student s) {
		String result=dao.addStudent(s);
		System.out.println(result);
	}

	@Override
	public void updateStudent(Student s) {
		
		String result=dao.updateStudent(s);
		System.out.println(result);
		
	}

	@Override
	public void listPersons() {
		List<Student> list=dao.listPersons();
		
		for(Student student:list) {
			System.out.println("Roll  : "+student.getRoll() );	
			System.out.println("Name  : "+student.getName() );	
			System.out.println("Marks : "+student.getMarks() );	
			System.out.println("------------------------------");
		}
		
		
	}

	@Override
	public void getStudentById(int roll) {
	Student student=dao.getStudentById(roll);
	
	
	System.out.println("Roll  : "+student.getRoll() );	
	System.out.println("Name  : "+student.getName() );	
	System.out.println("Marks : "+student.getMarks() );	
	
	
	
	}

	@Override
	public void removeStudent(int roll) {
		
		String result=dao.removeStudent(roll);
		System.out.println(result);
		
	}
	
	

}
