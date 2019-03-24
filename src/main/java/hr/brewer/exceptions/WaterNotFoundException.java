package hr.brewer.exceptions;

public class WaterNotFoundException extends RuntimeException  {

    public WaterNotFoundException(Long id) {
        super("Could not find water with id: " + id);
    }
}
