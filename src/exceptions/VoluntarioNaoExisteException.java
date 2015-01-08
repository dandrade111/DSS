package exceptions;

public class VoluntarioNaoExisteException extends Exception {
   
    public VoluntarioNaoExisteException() {
        super();
    }
    
    public VoluntarioNaoExisteException(String s){
        super(s);
    }
    
}
