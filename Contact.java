import java.util.Objects;

public final class Contact {
    private final String contactId;                  // <=10, non-null, immutable
    private String firstName;                        // <=10, non-null
    private String lastName;                         // <=10, non-null
    private String phone;                            // exactly 10 digits, non-null
    private String address;                          // <=30, non-null

    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        this.contactId = validateId(contactId, 10, "contactId");
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setAddress(address);
    }

    private static String validateId(String id, int max, String field) {
        if (id == null || id.length() == 0 || id.length() > max) {
            throw new IllegalArgumentException(field + " invalid");
        }
        return id;
    }

    private static String requireNonNullAndLen(String s, int max, String field) {
        if (s == null || s.length() == 0 || s.length() > max) {
            throw new IllegalArgumentException(field + " invalid");
        }
        return s;
    }

    public String getContactId() { return contactId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) {
        this.firstName = requireNonNullAndLen(firstName, 10, "firstName");
    }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) {
        this.lastName = requireNonNullAndLen(lastName, 10, "lastName");
    }

    public String getPhone() { return phone; }
    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("phone invalid");
        }
        this.phone = phone;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) {
        this.address = requireNonNullAndLen(address, 30, "address");
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact c = (Contact) o;
        return contactId.equals(c.contactId);
    }
    @Override public int hashCode() { return Objects.hash(contactId); }
}