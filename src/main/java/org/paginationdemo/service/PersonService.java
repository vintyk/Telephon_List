package org.paginationdemo.service;

import org.paginationdemo.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonService {

//	Page<Person> findAllPageable(Pageable pageable);

	Page<Person> findAllPageableOrderBylastName(Pageable pageable);
}
