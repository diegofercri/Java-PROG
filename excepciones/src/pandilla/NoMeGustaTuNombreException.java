package pandilla;

public class NoMeGustaTuNombreException extends Exception {

    public NoMeGustaTuNombreException() {
        super();
    }

    public NoMeGustaTuNombreException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public NoMeGustaTuNombreException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMeGustaTuNombreException(String message) {
        super(message);
    }

    public NoMeGustaTuNombreException(Throwable cause) {
        super(cause);
    }
}
