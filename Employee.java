package com.assignment;

import java.sql.Date;

public class Employee {
	
	private int empNo;
	private String eName;
	private String job;
	private int mgr;
	private Date hireDate;
	private int sallry;
	private int commesion;
	private int deptNo;
	
	public Employee(int empNo, String eName, String job, int mgr, Date hireDate, int sallry, int commesion,
			int deptNo) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sallry = sallry;
		this.commesion = commesion;
		this.deptNo = deptNo;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public int getSallry() {
		return sallry;
	}
	public void setSallry(int sallry) {
		this.sallry = sallry;
	}
	public int getCommesion() {
		return commesion;
	}
	public void setCommesion(int commesion) {
		this.commesion = commesion;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

}
