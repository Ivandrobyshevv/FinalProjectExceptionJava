package service;

import java.util.HashSet;

public interface IContactService<C> {
    boolean createContact(String ... arg);
    boolean setContacts(HashSet<C> c);
    boolean remove(C c);
    HashSet<C> getAll();


}