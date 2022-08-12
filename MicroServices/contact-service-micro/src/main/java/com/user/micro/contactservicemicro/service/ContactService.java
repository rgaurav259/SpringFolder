package com.user.micro.contactservicemicro.service;

import com.user.micro.contactservicemicro.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);
}
