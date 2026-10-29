import java.util.Arrays;
import java.util.Random;

public class IntArray {

    // Private data fields
    private int length;
    private int[] myArray;

    // Constructor
    public IntArray(int l) {
        length = l;
        myArray = new int[length];
    }

    // Clear the array
    public void clear() {
        myArray = new int[0];
        length = 0;
    }

    // Fill array with random numbers between 1 and 6
    public void fillRand() {
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            myArray[i] = rand.nextInt(6) + 1;
        }
    }

    // Return value at specified index
    public int get(int element) {
        return myArray[element];
    }

    // Change value at specified index
    public void set(int element, int newValue) {
        myArray[element] = newValue;
    }

    // Return number of elements
    public int size() {
        return length;
    }

    // Check if array is empty
    public boolean isEmpty() {
        return length == 0;
    }

    // Sort array
    public void sort() {
        Arrays.sort(myArray);
    }

    // Display array contents
    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}
