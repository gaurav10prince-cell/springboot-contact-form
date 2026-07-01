package com.example.contactform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.contactform.entity.Contact;
import com.example.contactform.repository.ContactRepository;

@RestController
public class ContactController {

    @Autowired
    private ContactRepository repository;

    @GetMapping("/test")
    public String test() {
        return "Controller Working";
    }

    @PostMapping("/contact")
    public String submitForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        Contact contact = new Contact();

        contact.setName(name);
        contact.setEmail(email);
        contact.setMessage(message);

        repository.save(contact);

        return "Form Submitted Successfully and Saved to Database!";
    }

    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return repository.findAll();
    }
}