package Com.masai.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Com.masai.Utility.EMUtility;
import Com.masai.entity.Student;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String addStudent(Student s) {
        String result="Student is Not Registered";		
		EntityManager em= EMUtility.getEntityManager();
		
		em.getTransaction().begin();
		
		
		em.persist(s);
		result="Student is Registered Successfully";	
		
		
		em.getTransaction().commit();
		em.close();
		
		
	 	return result;
	}

	@Override
	public String updateStudent(Student s) {
		String result="Student is Not Update";
	 	EntityManager em= EMUtility.getEntityManager();
		
	 	Student student= em.find( Student.class, s.getRoll());
	 	
         if(student!=null) {
        	 em.getTransaction().begin();
        	 
        	 student.setName(s.getName());
        	 student.setMarks(s.getMarks());
        	 result="Student is Update Successfully..";
        	 
        	 
        	 em.getTransaction().commit();
        	 em.close();
        	 
        	 
         }
         else {
        	 
        	result="Student is Not Avliable By Given Roll";
        	 
         }
	 	
	 	
		return result;
	}

	@Override
	public List<Student> listPersons() {
	 	EntityManager em= EMUtility.getEntityManager();
		List<Student> list=null;
		
		
		String jpql="Select S from Student S";
		
		Query query=em.createQuery(jpql);
		
	    list=query.getResultList();
	 	
		if(list==null) {
			
			RuntimeException exception=new RuntimeException("Student Database Empty");
			
			throw exception;
			 
		}
	    
	    return list;
	    
	}

	@Override
	public Student getStudentById(int roll) {
	 	EntityManager em= EMUtility.getEntityManager();
	
	
		
	 	Student student= em.find( Student.class, roll);
	 	
         if(student==null) {
        		RuntimeException exception=new RuntimeException("Student Database Empty");
    			
    			throw exception;
        	 
         }
         return student;
	}

	@Override
	public String removeStudent(int roll) {
	 	EntityManager em= EMUtility.getEntityManager();
String result="Student Is Not Remove";
		
	 	Student student= em.find( Student.class, roll);
	 	
         if(student!=null) {
          em.getTransaction().begin();
        	
          em.remove(student);
           
          result="Student Is  Remove Successfully..";
          
        	em.getTransaction().commit(); 
         }
         return result;
	}
	
	

}
