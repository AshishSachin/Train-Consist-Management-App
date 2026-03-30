import java.util.LinkedList;

public class train_consist_mngmt_app {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 3: Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Step 4: Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        // Step 5: Display after insertion
        System.out.println("\nTrain Consist after adding Pantry Car:");
        System.out.println(trainConsist);

        // Step 6: Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Step 7: Final consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);
    }
}