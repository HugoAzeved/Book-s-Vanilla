package com.books.api.repository;

import com.books.api.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ContactRepository extends JpaRepository<Contact, Long> {
}