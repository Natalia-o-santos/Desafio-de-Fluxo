

public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException() {
        super("parametro um deve ser menor que parametro dois");
    }
}