package junit_demo;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContactManager {
    Map<String, Contact> contactList = new ConcurrentHashMap<>();

    public void addContact(String fn, String ln, String pn){
        Contact contact = new Contact(fn, ln, pn);
        validateContact(contact);
        checkIfContactAlreadyExist(contact);
        contactList.put(generateKey(contact), contact);
    }

    public Collection<Contact> getAllContacts() { return contactList.values();};

    private void checkIfContactAlreadyExist(Contact contact){
        if (contactList.containsKey(generateKey(contact))){
            throw new RuntimeException("Contact already exists");
        }
    }

    private void validateContact(Contact contact){
        contact.validateFirstName();
        contact.validateLastName();
        contact.validatePhoneNumber();
    }

    private String generateKey(Contact contact){
        return String.format("%s-%s", contact.getFirstName(), contact.getLastName());
    }
}

