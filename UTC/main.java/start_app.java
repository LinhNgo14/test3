import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class StartAppTest {

    @Test
    public void testStartApp() {
        Object result = StartApp.startApp();
        assertNotNull(result, "startApp() should not return null");
    }
}
