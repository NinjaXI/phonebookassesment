package com.vincent.phonebook.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Phonebook {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private boolean defaultBook;
	@OneToMany(mappedBy = "phonebookId", fetch= FetchType.EAGER)
	private List<Entry> entries;
	
	public Phonebook() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDefaultBook() {
		return defaultBook;
	}

	public void setDefaultBook(boolean defaultBook) {
		this.defaultBook = defaultBook;
	}

	public List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		for(Entry bookEntry : entries) {
			bookEntry.setPhonebookId(this.getId());
		}
		this.entries = entries;
	}
}
