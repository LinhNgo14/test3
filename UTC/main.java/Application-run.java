import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestApplicationRun {

    @Test
    public void testRun() {
        Application app = new Application();
        Object result = app.run();
        assertNotNull(result);
    }
}
