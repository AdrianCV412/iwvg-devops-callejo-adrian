package adrian.callejo.devops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User("1", "Adrian", "Callejo");
    }

    @Test
    void testInitials() {
        assertEquals("A.", user.initials());
    }

    @Test
    void testFullName() {
        assertEquals("Adrian Callejo", user.fullName());
    }

    @Test
    void testFamilyNameInitials() {
        assertEquals("C.", user.familyNameInitials());
    }

    @Test
    void testGetId(){
        assertEquals("1",user.getId());
    }

    @Test
    void testSetName(){
        user.setName("John");
        assertEquals("John", user.getName());
    }

    @Test
    void testSetFamilyName(){
        user.setFamilyName("Doe");
        assertEquals("Doe", user.getFamilyName());
    }
}
