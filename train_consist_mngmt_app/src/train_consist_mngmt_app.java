import java.util.ArrayList;
import java.util.List;

public class train_consist_mngmt_app {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Step 3: Add passenger bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 4: Display bogies after addition
        System.out.println("\nPassenger Bogies after adding:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // Step 5: Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Step 6: Display bogies after removal
        System.out.println("\nPassenger Bogies after removing AC Chair:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // Step 7: Check if Sleeper exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does not exist.");
        }

        // Step 8: Final list state
        System.out.println("\nFinal Passenger Bogies:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }
    }
}