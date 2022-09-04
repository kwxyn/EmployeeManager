package tech.getarrays.employeemanager.model;

import java.io.Serializable;

import javax.persistence.*;


import org.hibernate.annotations.Columns;

@Entity
public class Employee implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (nullable=false, updatable = false)
	private long id;
	private String name;
	private String email;
	private String jobTitle;
	private String phone;
	private String imageUrl;
	private String employeeCode;
	
	public Employee()
	{
		
	}
	
	public Employee(String name,String email, String jobTitle, String phone, String imageUrl, String employeeCode)
	{
		this.setName(name);
		this.setEmail(email);
		this.setJobTitle(jobTitle);
		this.setPhone(phone);
		this.setImageUrl(imageUrl);
		this.setEmployeeCode(employeeCode);
	}
	
	public Long getId()
	{
		return id;
		
	}
	
	public void setId(Long id)
	{
		this.id = id;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	
	@Override
	public String toString()
	{
		return "Employee{" + 
				"id=" + id+
				", name='" +name+ '\''+
				", email='" +email+ '\''+
				", jobTitle='" +jobTitle+ '\''+
				", phone='" +phone+ '\''+
				", imageUrl='" +imageUrl + '\''+
				'}';
	}
}
