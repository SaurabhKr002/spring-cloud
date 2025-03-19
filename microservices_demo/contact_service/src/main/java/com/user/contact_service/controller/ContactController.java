package com.user.contact_service.controller;

import com.user.contact_service.entity.Contact;
import com.user.contact_service.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/user/{userId}")
    public List<Contact> getContact(@PathVariable("userId") Long userId){

        return this.contactService.getContactsOfUser(userId);
    }

}
