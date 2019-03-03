package com.vincent.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vincent.phonebook.model.Entry;
import com.vincent.phonebook.model.Phonebook;
import com.vincent.phonebook.service.EntryService;
import com.vincent.phonebook.service.PhonebookService;

@RestController
@CrossOrigin
public class PhonebookController {
	
	@Autowired
	private EntryService entryService;
	@Autowired
	private PhonebookService phonebookService;
	
	@GetMapping("/")
	public Phonebook viewPhonebook() {
		return phonebookService.getDefaultPhonebook();
	}
	
	@PostMapping("/addEntry")
	public void addEntry(@RequestBody Entry entry) {
		//System.out.println(entry.getName());
		entryService.addNewEntry(entry);
	}
}
