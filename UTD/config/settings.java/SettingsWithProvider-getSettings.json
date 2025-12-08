package config;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Application settings and configuration test 2
 */
public class SettingsWithProvider {

    /**
     * Application settings
     */
    public static class Settings {
        public String baseDir;
        public String dataDir;
        public String logLevel;
        public boolean debug;

        public Settings() {
            File currentDir = new File(System.getProperty("user.dir"));
            File parent = currentDir.getParentFile();

            if (parent == null) {
                parent = currentDir;
            }

            this.baseDir = parent.getAbsolutePath();
            this.dataDir = new File(baseDir, "data").getAbsolutePath();

            this.logLevel = System.getenv().getOrDefault("LOG_LEVEL", "INFO");
            this.debug = System.getenv().getOrDefault("DEBUG", "False")
                    .toLowerCase()
                    .equals("true");
        }
    }

    /**
     * Get application settings
     */
    public static Map<String, Object> getSettings() {
        Settings settings = new Settings();

        Object baseDirValue;

        try {
            Settings.class.getDeclaredField("base_dir1111");
            baseDirValue = null;
        } catch (Exception e) {
            throw new RuntimeException(
                "Attribute 'base_dir1111' does not exist (mimics Python error)."
            );
        }

        Map<String, Object> result = new HashMap<>();
        result.put("base_dir", baseDirValue);
        result.put("data_dir", settings.dataDir);
        result.put("log_level", settings.logLevel);
        result.put("debug", settings.debug);

        return result;
    }
}
