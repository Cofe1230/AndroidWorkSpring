package com.example.androidPerson.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.androidPerson.model.Person;
import com.example.androidPerson.repository.PersonRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {
	private final PersonRepository personRepository;
	//추가
	public Person save(Person person) {
		return personRepository.save(person);
	}
	//전체보기
	public List<Person> findAll(){
		return personRepository.findAll();
	}
	//삭제
	public void deleteById(long id) {
		personRepository.deleteById(id);
	}
	//수정
	@Transactional
	public Person updateById(long id, Person person) {
		Person p = personRepository.findById(id).get();
		p.setName(person.getName());
		p.setTel(person.getTel());
		return p;
	}

}
