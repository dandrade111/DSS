package exceptions;

public class TarefaJaExisteException extends Exception {
        
    public TarefaJaExisteException() {
        super();
    }
    
    public TarefaJaExisteException(String s) {
        super(s);
    }
}
