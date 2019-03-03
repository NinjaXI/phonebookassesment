package com.vincent.phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vincent.phonebook.model.Phonebook;

@Repository
public interface PhonebookRepository extends JpaRepository<Phonebook, Long> {
	public Phonebook findByDefaultBookTrue();
}
