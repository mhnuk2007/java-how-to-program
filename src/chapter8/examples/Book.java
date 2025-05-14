package chapter8.examples;
// Fig. 8.10: Book.java
// Declaring an enum type with a constructor and explicit instance fields
// and accessors for these fields

public enum Book {
    // declare constants of enum type
    JHTP("Java How to Program", "2012"),
    CHTP("C How to Program", "2007"),
    IW3HTP("Internet & WWW How to Program", "2008"),
    CPPHTP("C++ How to Program", "2012"),
    VBHTP("Visual Basic How to Program", "2011"),
    CSHARPHTP("C# How to Program", "2012");

    // Instance fields
    private final String title; // book title
    private final String copyrightYear; // copyright year

    // Enum Constructor
    Book(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    // accessor for field title
    public String getTitle() {
        return title;
    }

    // accessor for field copyrightYear
    public String getCopyrightYear() {
        return copyrightYear;
    }
} // end enum Book
