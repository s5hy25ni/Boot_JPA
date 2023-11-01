package com.min.edu.vo2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@ToString
@NoArgsConstructor
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseid;
	private String title;
	
	@OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
	private List<Evaluation> courseStudent;

	public Course(String title, List<Evaluation> courseStudent) {
		super();
		this.title = title;
		this.courseStudent = courseStudent;
	}
}
