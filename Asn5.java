import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        // ArrayList #1: Strings
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        // ArrayList #2: Integers
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(64);

        // Display the original contents
        System.out.println("=== Original fruits (basic for loop) ===");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println((i + 1) + ". " + fruits.get(i));
        }

        System.out.println();
        System.out.println("=== Original scores (enhanced for loop) ===");
        for (Integer score : scores) {
            System.out.println("Score: " + score);
        }

        // Try out 2 more methods on each list
        // Strings: remove() and set()
        fruits.remove("Banana");          // removes the item "Banana"
        fruits.set(0, "Green Apple");     // replaces the item at index 0

        // Integers: remove() by index and add() at a specific index
        scores.remove(3);                 // removes the item at index 3 (64)
        scores.add(1, 100);               // inserts 100 at index 1

        // Display the changed contents
        System.out.println();
        System.out.println("=== Updated fruits (forEach method) ===");
        System.out.println("Size is now: " + fruits.size());
        fruits.forEach(fruit -> System.out.println("Fruit: " + fruit));

        System.out.println();
        System.out.println("=== Updated scores (basic for loop) ===");
        System.out.println("Size is now: " + scores.size());
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Score " + (i + 1) + ": " + scores.get(i));
        }
    }
}
    

