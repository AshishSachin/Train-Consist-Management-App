import java.util.Arrays;

public class train_consist_mngmt_app {

    // Linear Search method
    public static boolean linearSearch(String[] bogieIDs, String key) {

        for (String id : bogieIDs) {
            if (id.equals(key)) {
                return true; // found → stop early
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogieIDs = {"BG101","BG205","BG309","BG412","BG550"};
        String searchKey = "BG309";

        System.out.println("\nBogie List:");
        System.out.println(Arrays.toString(bogieIDs));

        boolean found = linearSearch(bogieIDs, searchKey);

        System.out.println("\nSearching for: " + searchKey);
        System.out.println(found ? "Bogie Found ✅" : "Bogie Not Found ❌");
    }
}