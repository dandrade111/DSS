package exceptions;

public class QuestaoNaoExisteException extends Exception {
    
    public QuestaoNaoExisteException() {
        super();
    }
    
    public QuestaoNaoExisteException(String s){
        super(s);
    }
    
}
