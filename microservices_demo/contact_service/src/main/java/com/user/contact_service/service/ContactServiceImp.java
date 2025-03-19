package com.user.contact_service.service;

import com.user.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImp implements ContactService{

    List<Contact> list = List.of(
            new Contact(10L, "John@gmail.com", "John", 1L),
            new Contact(20L, "Sam@gmail.com", "Sam", 2L),
            new Contact(30L, "Tom@gmail.com", "Tom", 3L),
            new Contact(40L, "John2@gmail.com", "John",1L)
            );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
