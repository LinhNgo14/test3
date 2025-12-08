import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ApplicationShutdownTest {

    @Test
    public void testShutdown() {
        Application app = new Application();

        app.initialize();

        app.shutdown();

        assertNull(app.getConfig());
        assertNull(app.getSettings());
    }
}
