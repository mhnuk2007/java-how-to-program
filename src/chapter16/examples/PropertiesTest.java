package chapter16.examples;// Fig. 16.19: PropertiesTest.java
// Demonstrates class Properties of the java.util package.
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties table = new Properties(); // create Properties object

        // set properties
        table.setProperty("color", "blue");
        table.setProperty("width", "200");

        System.out.println("After setting properties");
        listProperties(table);

        // replace property value
        table.setProperty("color", "red");

        System.out.println("After replacing properties");
        listProperties(table);

        saveProperties(table); // save to file

        table.clear(); // empty table
        System.out.println("After clearing properties");
        listProperties(table);

        loadProperties(table); // load from file

        // get value of property "color"
        Object value = table.getProperty("color");

        // check if value is in table
        if (value != null)
            System.out.printf("Property color's value is %s%n", value);
        else
            System.out.println("Property color is not in table");
    }

    // save properties to a file
    private static void saveProperties(Properties props) {
        try {
            FileOutputStream output = new FileOutputStream("props.dat");
            props.store(output, "Sample Properties"); // save properties
            output.close();

            System.out.println("After saving properties");
            listProperties(props);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    // load properties from a file
    private static void loadProperties(Properties props) {
        try {
            FileInputStream input = new FileInputStream("props.dat");
            props.load(input); // load properties
            input.close();

            System.out.println("After loading properties");
            listProperties(props);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    // output property values
    private static void listProperties(Properties props) {
        Set<Object> keys = props.keySet(); // get property names

        // output name/value pairs
        for (Object key : keys)
            System.out.printf("%s\t%s%n", key, props.getProperty((String) key));

        System.out.println(); // print a blank line
    }
} // end class PropertiesTest
