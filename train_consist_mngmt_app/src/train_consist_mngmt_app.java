import java.util.Arrays;

public class train_consist_mngmt_app {

    // Binary Search method
    public static boolean binarySearch(String[] bogieIDs, String key) {

        // Ensure array is sorted
        Arrays.sort(bogieIDs);

        int low = 0;
        int high = bogieIDs.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = bogieIDs[mid].compareTo(key);

            if (comparison == 0) {
                return true; // found
            } else if (comparison < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogieIDs = {"BG309","BG101","BG550","BG205","BG412"};
        String searchKey = "BG205";

        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogieIDs));

        boolean found = binarySearch(bogieIDs, searchKey);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieIDs));

        System.out.println("\nSearching for: " + searchKey);
        System.out.println(found ? "Bogie Found ✅" : "Bogie Not Found ❌");
    }
}