package Part_2_1;

public class TooLongDistanceException extends RuntimeException {
    public TooLongDistanceException(String errorMessage) {
        super(errorMessage);
    }

    public void exception() {
        throw new TooLongDistanceException("Слишком большое расстояние для поездки");
    }
}