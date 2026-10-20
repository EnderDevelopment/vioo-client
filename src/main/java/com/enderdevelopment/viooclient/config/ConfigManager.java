package com.enderdevelopment.viooclient.config;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private static final Map<String, Object> config = new HashMap<>();

    public static void saveConfig() {
        // Save configuration
    }

    public static void loadConfig() {
        // Load configuration
    }

    public static void setConfigValue(String key, Object value) {
        config.put(key, value);
    }

    public static Object getConfigValue(String key) {
        return config.get(key);
    }
}