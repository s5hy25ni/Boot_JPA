package com.min.edu.vo2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter
@Setter
@ToString(exclude = "studentCourse")
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long stuid;
	private String name;
	
	@OneToMany(mappedBy = "student")
	private List<Evaluation> studentCourse;

	public Student(String name, List<Evaluation> studentCourse) {
		super();
		this.name = name;
		this.studentCourse = studentCourse;
	}
	
	
}
