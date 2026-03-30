import java.util.*;

// Bogie Class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class train_consist_mngmt_app {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create List of Bogie objects
        List<Bogie> bogieList = new ArrayList<>();

        // Step 3: Add bogies with capacities
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 24));

        // Step 4: Sort using Comparator (by capacity)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 5: Display sorted bogies
        System.out.println("\nBogies sorted by capacity (Ascending):");
        for (Bogie b : bogieList) {
            System.out.println(b.name + " -> " + b.capacity);
        }
    }
}