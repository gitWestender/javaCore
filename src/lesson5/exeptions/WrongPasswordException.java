package lesson5.exeptions;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException(String msg) {
        super(msg);
    }
}
