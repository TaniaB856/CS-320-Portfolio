import java.util.*;

public class ContactService {
    private final Map<String, Contact> contacts = new HashMap<>();

    public void add(Contact contact) {
        Objects.requireNonNull(contact, "contact");
        String id = contact.getContactId();
        if (contacts.containsKey(id)) throw new IllegalArgumentException("duplicate id");
        contacts.put(id, contact);
    }

    public void delete(String contactId) {
        if (contactId == null || contacts.remove(contactId) == null)
            throw new NoSuchElementException("id not found");
    }

    public void updateFirstName(String contactId, String firstName) {
        get(contactId).setFirstName(firstName);
    }
    public void updateLastName(String contactId, String lastName) {
        get(contactId).setLastName(lastName);
    }
    public void updatePhone(String contactId, String phone) {
        get(contactId).setPhone(phone);
    }
    public void updateAddress(String contactId, String address) {
        get(contactId).setAddress(address);
    }

    public Contact get(String contactId) {
        Contact c = contacts.get(contactId);
        if (c == null) throw new NoSuchElementException("id not found");
        return c;
    }
}