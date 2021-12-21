public class SocSecException extends Exception {

    public SocSecException(String Error)
    {
        super("Invalid Social Security Number "+Error);
    }
    
}
