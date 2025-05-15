📘 Garbage Collection in Java
🔍 What Is Garbage Collection?
Garbage collection (GC) is the automatic process of identifying and reclaiming memory that is no longer in use by the program. In Java, this helps to prevent memory leaks, reduce manual memory management errors, and simplify development.

When an object is no longer referenced by any part of the program, it becomes eligible for garbage collection.

⚙️ How Does It Work?
Java programs run on the Java Virtual Machine (JVM), which includes a garbage collector that handles memory management.

The garbage collector monitors object references and reclaims memory by destroying unreachable objects.

Java uses heap memory to store objects. The heap is divided into generations to optimize the collection process:

Young Generation – where new objects are allocated.

Old (Tenured) Generation – where long-lived objects are promoted.

Permanent Generation (Pre-Java 8) – for metadata like class definitions. Replaced by Metaspace in Java 8+.

🔄 When Is Garbage Collection Triggered?
The exact time of garbage collection is not guaranteed.

The JVM decides automatically when to run it, typically when:

Heap memory is low.

System.gc() is called (not recommended, only a suggestion).

Developers cannot force garbage collection—only request it.

✅ Object Eligibility for Garbage Collection
An object becomes eligible for GC when:

No live thread can access it (i.e., no active references to it).

Example:
```java
MyClass obj = new MyClass(); // object created
obj = null;                  // now eligible for GC
```
❌ What About finalize()?
All Java classes inherit the finalize() method from java.lang.Object.

It was originally meant to perform cleanup before GC.

Deprecated in Java 9 and removed in Java 18 due to:

Unpredictable behavior.

Performance issues.

Risk of resource leaks.

🛑 You should avoid using finalize() in modern Java development.

✅ Best Practices for Resource Management
Instead of relying on finalize(), Java provides better alternatives:

🔸 Try-with-Resources and AutoCloseable
Used for managing non-memory resources (files, sockets, DB connections, etc.).

```java
try (FileReader fr = new FileReader("data.txt")) {
// use the file
} catch (IOException e) {
e.printStackTrace();
}
// file automatically closed
```
The object must implement the AutoCloseable interface.

Resources are automatically closed when the try block finishes.

📉 Can Memory Leaks Still Happen in Java?
Yes, but they're different from those in C/C++:

Java handles memory deallocation automatically.

But you can still have logical memory leaks, where objects are still referenced unintentionally (e.g., via static collections, listeners, caches).

Example of a memory leak:

```java
List<Object> leakyList = new ArrayList<>();
while (true) {
leakyList.add(new Object()); // keeps growing and never released
}
```
📚 Summary
Concept	Explanation
GC	Automatic memory management in Java
Trigger	JVM-determined (based on memory usage)
Eligible	Objects with no references
finalize()	Deprecated – don’t use
Best practice	Use try-with-resources and AutoCloseable
Leaks	Logical leaks possible via lingering references

🧠 Key Takeaways
Java helps automate memory management, reducing common errors.

Garbage Collection makes development safer and easier—but you are still responsible for managing non-memory resources (files, streams, sockets).

Use modern resource management techniques like try-with-resources to ensure system stability and prevent leaks.
