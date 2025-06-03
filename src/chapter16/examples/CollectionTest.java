package chapter16.examples;
// Fig. 16.2: CollectionTest.java
// Collection interface demonstrated via an ArrayList object.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        // Add elements from colors array to list
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<>();
        for (String color : colors) {
            list.add(color);
        }

        // Print initial list
        System.out.println("Initial list: " + list);

        // Add elements from removeColors array to removeList
        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<>();
        for (String color : removeColors) {
            removeList.add(color);
        }

        // Print remove list
        System.out.println("Colors to remove: " + removeList);

        // Output list contents
        System.out.print("ArrayList before removal: ");
        for (String color : list) {
            System.out.printf("%s ", color);
        }

        // Remove from list the colors contained in removeList
        removeColors(list, removeList);

        // Output list contents after removal
        System.out.printf("%n%nArrayList after calling removeColors:%n");
        for (String color : list) {
            System.out.printf("%s ", color);
        }
    }

    // Remove colors specified in collection2 from collection1
    public static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        Iterator<String> iterator = collection1.iterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            if (collection2.contains(current)) {
                iterator.remove(); // Safe removal while iterating
            }
        }
    }
}
