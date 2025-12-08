import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class TestApplicationInitialize {

    @Test
    public void testInitialize() {
        Application app = new Application();

        // initialize() in Python returns (config, settings)
        Map<String, Object>[] result = app.initialize();

        Map<String, Object> config = result[0];
        Map<String, Object> settings = result[1];

        assertNotNull(config);
        assertNotNull(settings);
        assertNotNull(app.config);
        assertNotNull(app.settings);
    }
}
