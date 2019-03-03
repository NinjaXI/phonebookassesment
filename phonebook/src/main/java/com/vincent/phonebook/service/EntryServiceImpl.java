package com.vincent.phonebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vincent.phonebook.model.Entry;
import com.vincent.phonebook.repository.EntryRepository;

@Service
public class EntryServiceImpl implements EntryService {
	@Autowired
	private EntryRepository entryRepo;

	public Entry getEntryById(Long id) {
		return entryRepo.findById(id).get();
	}
	
	public void addNewEntry(Entry newEntry) {
		entryRepo.saveAndFlush(newEntry);
	}

}
