package com.example.androidPerson.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.androidPerson.model.Person;
import com.example.androidPerson.service.PersonService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PersonController {
	private final PersonService personService;
	
	//추가
	@PutMapping("/insert")
	public Person insert(@RequestBody Person person) {
		return personService.save(person);
	}
	
	//전체보기
	@GetMapping("/list")
	public List<Person> list(){
		return personService.findAll();
	}
	//삭제
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable long id) {
		personService.deleteById(id);
	}
	//수정
	@PutMapping("/update/{id}")
	public Person updateById(@PathVariable long id,@RequestBody Person person) {
		return personService.updateById(id,person);
	}
}
