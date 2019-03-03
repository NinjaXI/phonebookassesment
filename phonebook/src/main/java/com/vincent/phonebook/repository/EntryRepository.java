package com.vincent.phonebook.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vincent.phonebook.model.Entry;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {

}
