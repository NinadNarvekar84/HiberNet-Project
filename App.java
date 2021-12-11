package com.smple.Jpa_Ninad;

import javax.persistence.*;

import java.util.List;
import main2.Student; 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		
		try
		{
			emf=Persistence.createEntityManagerFactory("jpa-todo");
			entityManager = emf.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
			Student student=new Student();
			student.setStudentId(101);
			student.setFname("Sahil");
			student.setLname("Vyas");
			student.setContact("1234567");
			student.setemailId("sahi123@gamil.com");
			student.setLocation("Mumbai");
			student.setdivision("10th");
			student.setCourse("JavaProgramming");
			
			student.setStudentId(102);
			student.setFname("Abhishek");
			student.setLname("Jain");
			student.setContact("9869675201");
			student.setemailId("abhi98@gmail.com");
			student.setLocation("Pune");
			student.setdivision("12th");
			student.setCourse("C#");
			
			student.setStudentId(103);
			student.setFname("Raj");
			student.setLname("shah");
			student.setContact("9869675801");
			student.setemailId("rjs64@gmail.com");
			student.setLocation("Indore");
			student.setdivision("10th");
			student.setCourse(".DotNet");
			
			student.setStudentId(104);
			student.setFname("Smriti");
			student.setLname("Jadhav");
			student.setContact("8850589740");
			student.setemailId("smritij5@gmail.com");
			student.setLocation("Goa");
			student.setdivision("12th");
			student.setCourse("PythonProgramming");
			
			student.setStudentId(105);
			student.setFname("Sumi");
			student.setLname("Khan");
			student.setContact("9869674801");
			student.setemailId("khansumi805@gmail.com");
			student.setLocation("Nagpur");
			student.setdivision("11th");
			student.setCourse("Asp.Net");
			
			student.setStudentId(106);
			student.setFname("john");
			student.setLname("Rex");
			student.setContact("1234567890");
			student.setemailId("jrx26@gmail.com");
			student.setLocation("Goa");
			student.setdivision("12th");
			student.setCourse("C/C++ Programming");
			
			entityManager.persist(student);
			transaction.commit();
			Query q = entityManager.createQuery("select v from Student v");
			
			List<Student> resultList = q.getResultList();
			System.out.println("num of sudents:" + resultList.size());
			for (Student next : resultList) {
				System.out.println("next student: " + next);
			}	
			
		}
		
		catch(Exception e)
		{
		   System.out.println("Error while uploading "+ e);
		   transaction.rollback();
		}
		finally
		{
			entityManager.close();
			emf.close();
		}
		
    }
}
