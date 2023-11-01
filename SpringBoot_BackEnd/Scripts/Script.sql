select *
	from evaluation e join student s 
	on e.student_id = s.stuid 
	join course c 
	on e.course_id = c.courseid 
	where s.stuid = '1';
	

select * from `user` u;