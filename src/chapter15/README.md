# 📁 Chapter 15: Files and Streams – Java How to Program (10th Edition)

This chapter focuses on **Java’s file I/O capabilities**, helping you read from and write to **text**, **binary**, and **random access** files. It also introduces key I/O classes from the standard and NIO.2 libraries.

---

## 📘 Key Concepts and Definitions

---

### 1. **Stream**
> A stream is a sequence of data. In Java, a stream is an abstraction used to read or write data.

- **InputStream**: Reads data **from** a source.
- **OutputStream**: Writes data **to** a destination.

📌 *Analogy:* Think of a stream like water flowing in a pipe. You can either fill the pipe (OutputStream) or read water from it (InputStream).

---

### 2. **Text File vs Binary File**

- **Text File**: Human-readable (e.g., `.txt`, `.csv`)
- **Binary File**: Machine-readable (e.g., `.dat`, `.exe`)

🔸 Use `Reader`/`Writer` for text, `InputStream`/`OutputStream` for binary.

---

### 3. **File Class**
Represents a file or directory in the file system.

```java
File file = new File("data.txt");
System.out.println(file.exists()); // true or false
```

---

### 4. **FileReader and FileWriter**
Used to read/write character-based files.

```java
// Write to file
FileWriter writer = new FileWriter("example.txt");
writer.write("Hello, world!");
writer.close();

// Read from file
FileReader reader = new FileReader("example.txt");
int data;
while ((data = reader.read()) != -1) {
    System.out.print((char) data);
}
reader.close();
```

---

### 5. **BufferedReader and BufferedWriter**
Wrap `Reader`/`Writer` for **efficient** reading/writing using buffers.

```java
BufferedReader br = new BufferedReader(new FileReader("example.txt"));
String line;
while ((line = br.readLine()) != null) {
    System.out.println(line);
}
br.close();
```

---

### 6. **PrintWriter**
Convenient for writing formatted text to files.

```java
PrintWriter pw = new PrintWriter("output.txt");
pw.printf("Total: %.2f", 123.456);
pw.close();
```

---

### 7. **Scanner (for Reading Files)**
Used to parse primitive types and strings using regex.

```java
Scanner scanner = new Scanner(new File("example.txt"));
while (scanner.hasNextLine()) {
    System.out.println(scanner.nextLine());
}
scanner.close();
```

---

### 8. **Formatter (for Writing Files)**
Formats text similar to `printf`.

```java
Formatter formatter = new Formatter("output.txt");
formatter.format("Name: %s, Age: %d", "Alice", 25);
formatter.close();
```

---

### 9. **Object Serialization**
Converting objects into a byte stream to save in a file or transmit over a network.

#### Classes Used:
- `ObjectOutputStream`
- `ObjectInputStream`

✅ **Serializable** Interface is required.

```java
class Person implements Serializable {
    String name;
    int age;
}

ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.dat"));
out.writeObject(new Person("Alice", 30));
out.close();

ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.dat"));
Person p = (Person) in.readObject();
in.close();
```

---

### 10. **RandomAccessFile**
Allows you to **read and write** to a file at **specific locations**.

```java
RandomAccessFile raf = new RandomAccessFile("data.dat", "rw");
raf.seek(100);         // Move to byte 100
raf.writeInt(42);      // Write integer
raf.seek(100);
System.out.println(raf.readInt()); // Read it back
raf.close();
```

---

### 11. **NIO.2 (New I/O) API**
Modern file I/O API introduced in Java 7. Use `Path`, `Paths`, and `Files`.

```java
Path path = Paths.get("example.txt");
Files.write(path, "Hello NIO".getBytes());
List<String> lines = Files.readAllLines(path);
lines.forEach(System.out::println);
```

---

### 12. **JFileChooser (GUI File Dialog)**
Swing component to allow users to select files/folders.

```java
JFileChooser fileChooser = new JFileChooser();
int result = fileChooser.showOpenDialog(null);
if (result == JFileChooser.APPROVE_OPTION) {
    File selectedFile = fileChooser.getSelectedFile();
    System.out.println("File: " + selectedFile.getAbsolutePath());
}
```

---

## 🧪 Use Cases & Examples

| Task                              | Tool/Class                  |
|-----------------------------------|-----------------------------|
| Read/write character text files   | FileReader / FileWriter     |
| Efficient read/write              | BufferedReader / Writer     |
| Parse data from text              | Scanner                     |
| Write formatted data              | Formatter / PrintWriter     |
| Read/write binary data            | DataInputStream / OutputStream |
| Serialize/deserialize objects     | ObjectInputStream / OutputStream |
| Access specific file locations    | RandomAccessFile            |
| Use modern file handling          | java.nio.file.Paths / Files |
| GUI file selection                | JFileChooser                |

---

## 🛠 How to Compile and Run

```bash
javac FileWriterExample.java
java FileWriterExample
```

---

## 📚 Summary

This chapter is crucial for understanding:
- **Data persistence** in Java applications.
- **How to deal with both text and binary formats.**
- **Serializing objects** for storage or network communication.
- Using **random access** for performance-sensitive applications like databases.
- Leveraging **modern Java NIO.2** for concise, readable file operations.

---

## 📌 Further Reading

- [Java I/O Tutorial (Oracle)](https://docs.oracle.com/javase/tutorial/essential/io/)
- [Java NIO Tutorial (Baeldung)](https://www.baeldung.com/java-nio-2-file-api)
- [Java Serialization Guide](https://www.baeldung.com/java-serialization)

---

## 🧠 Practice Exercises

- ✅ Create a contact manager that stores contacts in a text file.
- ✅ Serialize a list of `Person` objects and load them back.
- ✅ Use RandomAccessFile to implement a student record update system.
- ✅ Use `JFileChooser` to let user pick a file and display its contents.

---

## 📎 License

For personal, educational, and learning use only. All book content belongs to the authors and publishers of *Java How to Program (10th Edition)* by Paul and Harvey Deitel.

---