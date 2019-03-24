package hr.brewer;

import hr.brewer.exceptions.WaterNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class WaterNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(WaterNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String waterNotFoundHandler(WaterNotFoundException ex) {
        return ex.getMessage();
    }
}
