import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTextProcessorSummarize {

    private TextProcessor processor;

    @BeforeEach
    public void setUp() {
        processor = new TextProcessor();
    }

    @Test
    public void testSummarizeNormalText() {
        String text = "Machine learning is AI. It helps computers learn from data. "
                + "Used in vision, NLP, recommendation. Deep learning is powerful. "
                + "Neural networks are complex.";

        String result = processor.summarize(text, 3);

        assertNotNull(result);
        assertTrue(result instanceof String);
        assertTrue(result.contains("Machine learning"));
        assertTrue(result.contains("computers learn"));
    }

    @Test
    public void testSummarizeEmptyText() {
        String result = processor.summarize("", 3);
        assertEquals("", result);
    }

    @Test
    public void testSummarizeCustomN() {
        String text = "First sentence. Second sentence. Third sentence. Fourth sentence.";
        String result = processor.summarize(text, 2);

        assertNotNull(result);
        assertTrue(result instanceof String);

        // Rough sentence count check
        String[] sentences = result.split("\\.");
        int count = 0;
        for (String s : sentences) {
            if (!s.trim().isEmpty()) count++;
        }
        assertTrue(count <= 2);
    }

    @Test
    public void testSummarizeWithStopwords() {
        String text = "The cat is on the mat. The dog is in the house. The bird is in the tree.";
        String result = processor.summarize(text, 2);

        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testSummarizeSingleSentence() {
        String text = "This is a single sentence.";
        String result = processor.summarize(text, 3);

        assertEquals("This is a single sentence.", result);
    }

    @Test
    public void testSummarizeNoNonStopwords() {
        String text = "The is a. The is the. The is on.";
        String result = processor.summarize(text, 2);

        assertNotNull(result);
        assertTrue(result instanceof String);
    }
}
