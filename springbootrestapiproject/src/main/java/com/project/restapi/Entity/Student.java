package com.project.restapi.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="Id")
private int rollno;
@Column(name="Student_name")
private String name;
@Column
private float percentage;
@Column
private String branch;
public Student() {
}

public Student(String name, float percentage, String branch) {
	super();
	this.name = name;
	this.percentage = percentage;
	this.branch = branch;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + ", branch=" + branch + "]";
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPercentage() {
	return percentage;
}
public void setPercentage(float percentage) {
	this.percentage = percentage;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
}
