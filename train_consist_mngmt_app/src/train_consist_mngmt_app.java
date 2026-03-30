import java.util.LinkedHashSet;

public class train_consist_mngmt_app {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Step 3: Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 4: Add duplicate bogie
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // Step 5: Display final formation
        System.out.println("\nFinal Train Formation (Insertion Order Maintained):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}
