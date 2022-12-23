package com.first.controllers;

import com.first.models.Contact;
import com.first.services.ContactService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ContactController {

    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("contacts")
    public String contacts(Model m){
        m.addAttribute("contacts",contactService.findAll(1));
        return "contacts";
    }

    @GetMapping("add-contact")
    public String addContact(){
        return "add-contact";
    }
    @PostMapping("add-contact")
    public String addContact(@ModelAttribute @Valid Contact contact,
                             BindingResult result){
        if(result.hasErrors()){
            return "add-contact";
        }
        contactService.addContact(contact);
        return "redirect:contacts";
    }
    @RequestMapping("delete-contact")
    public String deleteById(@RequestParam int id){
        contactService.deleteById(id);
        return "redirect:contacts";
    }
    @GetMapping("update-contact")
    public String updateById(@RequestParam int id,Model model){
        Optional<Contact> contact=contactService.findById(id);
        model.addAttribute("contact",contact);
        return "add-contact";
    }
    @PostMapping("update-contact")
    public String updateById(@ModelAttribute @Valid Contact contact,
                             BindingResult result){
        if(result.hasErrors()){
            return "add-contact";
        }
        contactService.updateContact(contact);
        return "redirect:contacts";
    }
}
