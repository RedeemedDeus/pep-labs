
/**
 * This class represents a custom exception which may be thrown in the CustomExceptionThrower class.
 * By extending Exception, CustomException has inherited all the behavior of Exception while being its own class!
 * Potentially, this class could also override some the behavior of Exception.
 */
public class CustomException extends Exception{
    private String code;

    public CustomException(String code, String message) {
        super(message);
        this.setCode(code);
    }

    public CustomException(String code, String message, Throwable cause) {
        super(message, cause);
        this.setCode(code);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
