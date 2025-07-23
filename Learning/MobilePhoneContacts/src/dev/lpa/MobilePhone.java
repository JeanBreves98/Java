package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return false;
        }

        myContacts.add(contact);

        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if(findContact(oldContact) >= 0) {
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if(findContact(contact) >= 0) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contact.getName())) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);

        if (index >= 0){
            return myContacts.get(index);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");

        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }

    }
}
