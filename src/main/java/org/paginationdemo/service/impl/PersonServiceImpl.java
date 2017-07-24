package org.paginationdemo.service.impl;

import org.paginationdemo.domain.Person;
import org.paginationdemo.repository.PersonRepository;
import org.paginationdemo.service.PersonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImpl implements PersonService {

	private PersonRepository personRepository;

	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Transactional
	@Override
	public Page<Person> findAllPageableOrderBylastName(Pageable pageable) {
		return personRepository.findAll(pageable);
	}
}
