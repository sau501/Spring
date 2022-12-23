package com.first.services;

import com.first.dao.ContactRepository;
import com.first.models.Contact;

import jakarta.validation.Valid;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    private  ContactRepository contactRepository;
    int id=0;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> findAll(int id){
        return contactRepository.findAll();
    }

    public void addContact(Contact contact){
        Contact contact1=new Contact(++id,contact.getName(),
                contact.getDescription(), contact.getMobNO());
        contactRepository.save(contact1);
    }

    public void deleteById(int id){
        contactRepository.deleteById(id);
    }
    public Optional<Contact> findById(int id){
        return contactRepository.findById(id);
    }

	public void updateContact(@Valid Contact contact) {
		deleteById(contact.getId());
        contactRepository.save(contact);
	}
}
