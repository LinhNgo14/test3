import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class MainFunctionTest {

    @Test
    public void testMainExecution() {
        try {
            Main.main(new String[]{});
        } catch (Exception e) {
            fail("main() threw an unexpected exception: " + e.getClass().getName() + " - " + e.getMessage());
        }
    }
}
