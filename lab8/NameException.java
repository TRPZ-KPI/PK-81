package lab8;

public class NameException extends /*Throwable*/ RuntimeException {
    public NameException(String s) {
        super(s);
    }

    public NameException() {
    }
}
