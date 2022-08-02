package com.example.thymeleaf.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.thymeleaf.entity.*;

@Entity
@Table(name="employee")

public class Employee {
	@Id 	
	@Column(name="empno")
	private  int  empno;
	
	@Column(name="ename")
	private String ename;
	
	@Column(name="job")
	private String job;
	
	@Column(name="hiredate")
	private Date hiredate;
	
	@Column(name="managerid")
	private int managerId;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="commision")
	private int commision;
	
	@Column(name="deptno")
	private int deptno;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommision() {
		return commision;
	}

	public void setCommision(int commision) {
		this.commision = commision;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public Employee(int empno, String ename, String job, Date hiredate, int managerId, int salary, int commision,
			int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.managerId = managerId;
		this.salary = salary;
		this.commision = commision;
		this.deptno = deptno;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}





}