import java.util.ArrayList;
import java.util.List;
public class p23_generic {
    public static <T extends Comparable<T>> List<T> findMinimumElements(T[][] array) {
        List<T> minimumElements = new ArrayList<>();

        if (array.length == 0 || array[0].length == 0) {
            return minimumElements; // Return an empty list for empty arrays
        }
        T minElement = array[0][0];
        for (T[] row : array) {
            for (T element : row) {
                if (element.compareTo(minElement) < 0) {
                    minElement = element;
                    minimumElements.clear(); // Reset the list and add new minimum element
                    minimumElements.add(minElement);
                } else if (element.compareTo(minElement) == 0) {
                    minimumElements.add(minElement); // Add element if it's equal to the current minimum
                }
            }
        }
        return minimumElements;
    }

    public static void main(String[] args) {
        Integer[][] array = {
                { 5, 8, 2 },
                { 3, 6, 9 },
                { 7, 5, 4 }
        };

        List<Integer> minimumElements = findMinimumElements(array);
        System.out.println("Minimum elements: " + minimumElements);

    }
}


