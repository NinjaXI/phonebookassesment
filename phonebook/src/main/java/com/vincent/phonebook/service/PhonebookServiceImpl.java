package com.vincent.phonebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vincent.phonebook.model.Phonebook;
import com.vincent.phonebook.repository.PhonebookRepository;

@Service
public class PhonebookServiceImpl implements PhonebookService{
	@Autowired
	private PhonebookRepository phonebookRepo;
	
	public Phonebook getDefaultPhonebook() {
		return phonebookRepo.findByDefaultBookTrue();
	}

}
