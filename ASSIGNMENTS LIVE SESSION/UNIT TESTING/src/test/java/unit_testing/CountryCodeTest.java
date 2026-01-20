package unit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CountryCodeTest {

    CountryCode cc = new CountryCode();

    @Test
    void testCountryCode() {
        assertEquals("IN", cc.getCountryCode());
    }
}
