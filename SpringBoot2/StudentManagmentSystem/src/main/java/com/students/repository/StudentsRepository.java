package com.students.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.students.dto.Students;


public interface StudentsRepository extends JpaRepository<Students, Integer>
{

	public Students findBySname(String name);

	public Students findByPhno(long phno);

	@Query("select s.email from Students s where s.grade=?1")
	public List<String> getAllEmailsByGrade(String grade);

	@Modifying
	@Transactional
	@Query("update Students s set s.phno=?2 where s.sname=?1 ")
	public int updatePhno(String name,long Phno);

}
