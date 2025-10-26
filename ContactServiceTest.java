import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    @Test
    void addDeleteAndUpdate() {
        ContactService svc = new ContactService();
        Contact c = new Contact("C1","Ann","Lee","1112223333","Main St");
        svc.add(c);

        // duplicate id rejected
        assertThrows(IllegalArgumentException.class,
                () -> svc.add(new Contact("C1","Bob","Q","1234567890","X")));

        // updates
        svc.updateFirstName("C1","Ana");
        svc.updateLastName("C1","Li");
        svc.updatePhone("C1","9998887777");
        svc.updateAddress("C1","New Addr");

        Contact got = svc.get("C1");
        assertEquals("Ana", got.getFirstName());
        assertEquals("Li", got.getLastName());
        assertEquals("9998887777", got.getPhone());
        assertEquals("New Addr", got.getAddress());

        // delete
        svc.delete("C1");
        assertThrows(java.util.NoSuchElementException.class, () -> svc.get("C1"));
    }

    @Test
    void deleteMissingThrows() {
        ContactService svc = new ContactService();
        assertThrows(java.util.NoSuchElementException.class, () -> svc.delete("nope"));
    }
}