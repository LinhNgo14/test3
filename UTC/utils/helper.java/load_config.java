import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import utils.Helper;

import java.util.Map;

public class LoadConfigTest {

    @Test
    public void testLoadConfig() {
        Map<String, Object> config = Helper.loadConfig();

        // tương đương assertIsInstance(config, dict)
        assertTrue(config instanceof Map, "loadConfig should return a Map");
    }
}
