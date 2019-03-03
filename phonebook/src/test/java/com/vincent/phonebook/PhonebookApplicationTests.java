package com.vincent.phonebook;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vincent.phonebook.model.Entry;
import com.vincent.phonebook.model.Phonebook;
import com.vincent.phonebook.service.EntryService;
import com.vincent.phonebook.service.PhonebookService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PhonebookApplication.class)
public class PhonebookApplicationTests {
	
	@Autowired
	private PhonebookService phonebookService;
	@Autowired
	private EntryService entryService;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testGetDefaultPhonebook() {
		System.out.println("==================Testing DefaultPhonebook=================");
		Phonebook book = phonebookService.getDefaultPhonebook();
		assertEquals(Long.valueOf(1), book.getId());
		assertEquals("Base", book.getName());
		assertEquals(true, book.isDefaultBook());
	}
	
	@Test
	public void testAddEntry() {
		System.out.println("==================Testing AddEntry=================");
		Phonebook book = phonebookService.getDefaultPhonebook();
		
		Entry newEntry = new Entry();
		newEntry.setName("Dylan");
		newEntry.setNumber("0213257719");
		newEntry.setPhonebookId(book.getId());
		entryService.addNewEntry(newEntry);
		
		Entry testEntry = entryService.getEntryById(newEntry.getId());
		assertEquals(newEntry.getId(), testEntry.getId());
		assertEquals("Dylan", testEntry.getName());
		assertEquals("0213257719", testEntry.getNumber());
		assertEquals(book.getId(), testEntry.getPhonebookId());
	}
}
