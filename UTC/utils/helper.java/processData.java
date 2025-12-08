import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import utils.Helper;

import java.util.HashMap;
import java.util.Map;

public class TestProcessData {

    @Test
    public void testProcessDataDict() {
        Map<String, Object> data = new HashMap<>();
        data.put("key1", "value1");
        data.put("key2", "value2");

        String result = Helper.processData(data);

        assertTrue(result.contains("Processed"));
        assertTrue(result.contains("2"));
    }

    @Test
    public void testProcessDataEmpty() {
        String result = Helper.processData(null);
        assertEquals("No data to process", result);
    }
}
