package unit_testing;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DataPresentFlagTest {

    DataPresentFlag dp = new DataPresentFlag();

    @Test
    void testDataIsPresent() {
        assertTrue(dp.isDataPresent("SampleData"));
    }
}
