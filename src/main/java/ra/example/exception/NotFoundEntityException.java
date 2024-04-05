package ra.example.exception;

public class NotFoundEntityException extends Exception{
    public NotFoundEntityException(String message) {
        super(message);
    }
}
