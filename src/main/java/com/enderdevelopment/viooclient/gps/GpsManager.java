package com.enderdevelopment.viooclient.gps;

import java.util.HashMap;
import java.util.Map;

public class GpsManager {
    private static final Map<String, Waypoint> waypoints = new HashMap<>();
    private static Waypoint currentTarget;

    public static void setTarget(int x, int y, int z) {
        // Set GPS target
    }

    public static void clearTarget() {
        // Clear GPS target
    }

    public static void addWaypoint(String name, int x, int z) {
        // Add waypoint
    }

    public static void removeWaypoint(String name) {
        // Remove waypoint
    }

    public static Map<String, Waypoint> getWaypoints() {
        return waypoints;
    }

    public static class Waypoint {
        public final int x;
        public final int z;

        public Waypoint(int x, int z) {
            this.x = x;
            this.z = z;
        }
    }
}