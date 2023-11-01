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

@Table(name="DEPT")
@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Dept {
	
	@Id
	private Long deptno;
	
	@Column(name="DNAME")
	private String dname;
	
	@Column(name="LOC")
	private String loc;
	
	public Dept(String dname, String loc) {
		super();
		this.dname = dname;
		this.loc = loc;
	}
}
