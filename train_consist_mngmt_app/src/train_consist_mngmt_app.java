import java.util.Arrays;

public class train_consist_mngmt_app {

    // Method to sort bogie names
    public static void sortBogieNames(String[] bogies) {
        Arrays.sort(bogies);
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogies));

        sortBogieNames(bogies);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogies));
    }
}