package exceptions;

public class MaterialNaoExisteException extends Exception {
    
    public MaterialNaoExisteException() {
        super();
    }
    
    public MaterialNaoExisteException(String s) {
        super(s);
    }
}
