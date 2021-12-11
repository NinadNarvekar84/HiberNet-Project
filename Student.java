package main2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Student {

	private int studentId;
	private String fname;
	private String lname;
	private String contact;
	private String emailId;
	private String Location;
	private String division;
	private String Course;
	
	
	
	@Id
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getemailId() {
		return emailId;
	}
	public void setemailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getLocation() {
		return Location;
	}
	public void setLocation(String Location) {
		this.Location = Location;
	}
	
	public String getdivision() {
		return division;
	}
	public void setdivision(String division) {
		this.division = division;
	}
	
	public String getCourse() {
		return Course;
	}
	public void setCourse(String Course) {
		this.Course = Course;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fname=" + fname + ", lname=" + lname + ", contact=" + contact
				+ ",emailId=" + emailId +",Location=" + Location + ",division=" + division +",Course=" + Course +"]";
	}
	
}
