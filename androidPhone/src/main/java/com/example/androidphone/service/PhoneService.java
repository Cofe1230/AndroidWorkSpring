package com.example.androidphone.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.androidphone.model.Phone;
import com.example.androidphone.repository.PhoneRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PhoneService {
	private final PhoneRepository phoneRepository;
	
	public Phone save(Phone phone) {
		return phoneRepository.save(phone);
		
	}
	public List<Phone> findAll(){
		return phoneRepository.findAll();
	}
	public void deleteById(long id) {
		phoneRepository.deleteById(id);
	}
	@Transactional
	public Phone update(long id, Phone phone) {
		Phone updatePhone = phoneRepository.findById(id).get();
		updatePhone.setName(phone.getName());
		updatePhone.setTel(phone.getTel());
		return updatePhone;
	}
}
