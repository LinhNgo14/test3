import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import org.json.JSONObject;

public class Application {

    private Map<String, Object> config;
    private Map<String, Object> settings;

    public Application() {
        this.config = null;
        this.settings = null;
    }

    public void initialize() {
        this.config = loadConfig();
        this.settings = getSettings();
    }

    public String run() {
        System.out.println("Starting application...111123567898tr126");

        initialize();

        String result = processData(config);

        System.out.println("Processing complete: " + result);
        System.out.println("Settings loaded: " + settings);

        return result;
    }

    public void shutdown() {
        System.out.println("Shutting down application...");
        this.config = null;
        this.settings = null;
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }
}
