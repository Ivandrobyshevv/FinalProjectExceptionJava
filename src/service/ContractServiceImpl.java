package service;

import models.Contact;

import java.util.HashSet;

public class ContractServiceImpl implements IContactService<Contact>{
    private HashSet<Contact> contacts = new HashSet<>();

    @Override
    public boolean createContact(String ... arg) {
        Contact contact = new Contact(arg[0],arg[1],arg[2],arg[3],arg[4],arg[5]);
        return contacts.add(contact);
    }

    @Override
    public boolean setContacts(HashSet<Contact> c) {
        return contacts.addAll(c);
    }

    @Override
    public boolean remove(Contact contact) {
        return contacts.remove(contact);
    }

    @Override
    public HashSet<Contact> getAll() {
        return new HashSet<>(contacts);
    }
}
