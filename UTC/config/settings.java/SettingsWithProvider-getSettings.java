import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Map;

public class TestGetSettings {

    @Test
    public void testGetSettings() {
        Map<String, Object> settings = SettingsUtil.getSettings();

        assertNotNull(settings);

        assertTrue(settings instanceof Map);

        assertTrue(settings.containsKey("base_dir"));
        assertTrue(settings.containsKey("log_level"));
    }
}
