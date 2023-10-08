package lesson5.exeptions;

public class WrongLoginException extends RuntimeException{
    public WrongLoginException(String msg) {
        super(msg);
    }
}
