package adrian.callejo.devops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Collectors;

public class SearchTest {

    @Test
    void testFindUserIdByAnyProperFraction() {
        assertEquals(List.of("Oscar","Ana","Oscar","Antonio","Paula"), new Search().findUserNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }
}
