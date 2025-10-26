import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    void createValidContact() {
        Contact c = new Contact("abc123", "Tania", "Boursiquot", "1234567890", "123 Main Street, PSL");
        assertEquals("abc123", c.getContactId());
        assertEquals("Tania", c.getFirstName());
        assertEquals("Boursiquot", c.getLastName());
        assertEquals("1234567890", c.getPhone());
        assertEquals("123 Main Street, PSL", c.getAddress());
    }

    @Test
    void idCannotBeNullOrTooLong() {
        assertThrows(IllegalArgumentException.class,
                () -> new Contact(null, "A", "B", "1234567890", "addr"));
        assertThrows(IllegalArgumentException.class,
                () -> new Contact("01234567890", "A", "B", "1234567890", "addr")); // 11 chars
    }

    @Test
    void phoneMustBeExactly10Digits() {
        Contact c = new Contact("ID", "Jane", "Doe", "1234567890", "addr");
        assertThrows(IllegalArgumentException.class, () -> c.setPhone("12345"));
        assertThrows(IllegalArgumentException.class, () -> c.setPhone("abcdefghij"));
    }

    @Test
    void updateFieldConstraints() {
        Contact c = new Contact("ID", "Jane", "Doe", "1234567890", "addr");
        assertThrows(IllegalArgumentException.class, () -> c.setFirstName(null));
        assertThrows(IllegalArgumentException.class, () -> c.setLastName("abcdefghijkl")); // >10
        String tooLongAddr = "1234567890123456789012345678901"; // 31
        assertThrows(IllegalArgumentException.class, () -> c.setAddress(tooLongAddr));
    }
}
