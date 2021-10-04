package adrian.callejo.devops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user;

    @BeforeEach
    void before(){
        user = new User("1","Adrian","Callejo");
    }

    @Test
    void testInitials(){
        assertEquals("A.",user.initials());
    }

    @Test
    void testFullName(){
        assertEquals("Adrian Callejo",user.fullName());
    }

    @Test
    void testFamilyNameInitials(){
        assertEquals("C.",user.familyNameInitials());
    }
}
