package com.vincent.phonebook.service;

import com.vincent.phonebook.model.Entry;

public interface EntryService {
	public Entry getEntryById(Long id);
	public void addNewEntry(Entry newEntry);
}
