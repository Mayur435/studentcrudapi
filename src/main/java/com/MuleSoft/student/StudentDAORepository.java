package com.MuleSoft.student;

import org.springframework.data.repository.CrudRepository;

public interface StudentDAORepository extends CrudRepository<Student, String>{
	
}
