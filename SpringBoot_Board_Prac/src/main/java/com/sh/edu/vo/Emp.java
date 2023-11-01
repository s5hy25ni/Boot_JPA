package com.sh.edu.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name="EMP")
@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Emp {
	
	@Id
	private Long empno;
	
	@Column(name="ENAME")
	private String ename;
	
	@Column(name="JOB")
	private String job;
	
	@Column(name="MGR")
	private Long mgr;
	
	@Column(name="hiredate")
	private String hiredate;
	
	@Column(name="SAL")
	private Double sal;
	
	@Column(name="COMM")
	private Double comm;
	
	@Column(name="DEPTNO")
	private int deptno;
	
	public Emp(String ename, String job, Long mgr, String hiredate, Double sal, Double comm, int deptno) {
		super();
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
}
