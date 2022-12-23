package com.first.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.models.Contact;
import org.springframework.stereotype.Service;

@Service
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
