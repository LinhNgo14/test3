import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HelperUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Load configuration from JSON file
     */
    public static Map<String, Object> loadConfig() {
        try {
            String configPath = Paths.get(
                    HelperUtils.class.getProtectionDomain().getCodeSource().getLocation().getPath())
                    .getParent()                    
                    .resolve("../config/config.json")
                    .normalize()
                    .toString();

            String jsonContent = Files.readString(Paths.get(configPath), StandardCharsets.UTF_8);
            return objectMapper.readValue(jsonContent, Map.class);

        } catch (IOException e) {
            return Map.of("default", "config1111111");
        }
    }

    /**
     * Process input data
     */
    public static String processData(Object data) {
        if (data instanceof Map) {
            Map<?, ?> map = (Map<?, ?>) data;
            return "Processed " + map.size() + " items";
        }
        return "No data to process";
    }

    /**
     * Format output text
     */
    public static String formatOutput(String text) {
        return text.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(loadConfig());
        System.out.println(processData(Map.of("a", 1, "b", 2)));
        System.out.println(formatOutput("hello test pull"));
    }
}
