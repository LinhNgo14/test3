import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import utils.FormatUtils;

public class FormatOutputTest {

    @Test
    public void testFormatOutput() {
        String text = "hello world";
        String result = FormatUtils.formatOutput(text);
        assertEquals("HELLO WORLD", result, "formatOutput should convert text to uppercase");
    }
}
