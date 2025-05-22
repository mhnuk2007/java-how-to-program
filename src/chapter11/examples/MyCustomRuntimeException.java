package chapter11.examples;

// Unchecked Exception
public class MyCustomRuntimeException extends RuntimeException {
    public MyCustomRuntimeException() {
        super();
    }

    public MyCustomRuntimeException(String message) {
        super(message);
    }

    public MyCustomRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCustomRuntimeException(Throwable cause) {
        super(cause);
    }
}
