import java.util.Arrays;

public class train_consist_mngmt_app {

    // Search with validation
    public static boolean safeSearch(String[] bogieIDs, String key) {

        // Fail-fast check
        if (bogieIDs == null || bogieIDs.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // Linear search logic
        for (String id : bogieIDs) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogieIDs = {"BG101","BG205","BG309"};

        try {
            boolean found = safeSearch(bogieIDs, "BG205");

            System.out.println("\nBogie List:");
            System.out.println(Arrays.toString(bogieIDs));

            System.out.println("\nSearching for BG205:");
            System.out.println(found ? "Found ✅" : "Not Found ❌");

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Example empty case
        String[] empty = {};

        try {
            safeSearch(empty, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }
}