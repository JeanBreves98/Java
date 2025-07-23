package dev.lpa;

public class Main {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("123-456-789");

        Contact contact1 = new Contact("Alice", "111-111-111");
        Contact contact2 = new Contact("Bob", "222-222-222");
        Contact contact3 = new Contact("Charlie", "333-333-333");

        // Add contacts
        myPhone.addNewContact(contact1);
        myPhone.addNewContact(contact2);
        myPhone.addNewContact(contact3);

        // Print contacts
        System.out.println("All contacts:");
        myPhone.printContacts();

        // Update a contact
        Contact newBob = new Contact("Bobby", "222-222-222");
        myPhone.updateContact(contact2, newBob);

        // Print updated contacts
        System.out.println("\nAfter update:");
        myPhone.printContacts();

        // Query a contact
        System.out.println("\nQuery Bobby:");
        Contact found = myPhone.queryContact("Bobby");
        if (found != null) {
            System.out.println("Found: " + found.getName() + " -> " + found.getPhoneNumber());
        }

        // Remove a contact
        myPhone.removeContact(contact1);

        // Final list
        System.out.println("\nFinal contact list:");
        myPhone.printContacts();
    }
}
