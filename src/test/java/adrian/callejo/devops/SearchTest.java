package adrian.callejo.devops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Collectors;

public class SearchTest {

    @Test
    void testFindUserNameByAnyProperFraction() {
        assertEquals(List.of("Oscar","Ana","Oscar","Antonio","Paula"), new Search().findUserNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserFamilyNameByAnyProperFraction() {
        assertEquals(List.of("Fernandez","Blanco","López","Blanco","Torres"), new Search().findUserFamilyNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindHighestFraction(){
        assertEquals(new Fraction(1,0),new Search().findHighestFraction().get());
    }

    @Test
    void testFindFractionSubtractionByUserName(){
        assertEquals(new Fraction(0,0),new Search().findFractionSubtractionByUserName("Paula").get());
    }
}