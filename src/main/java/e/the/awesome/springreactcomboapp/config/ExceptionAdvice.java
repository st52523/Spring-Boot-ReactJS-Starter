package e.the.awesome.springreactcomboapp.config;

import e.the.awesome.springreactcomboapp.model.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(Exception.class)
    protected ApiResponse handleGlobalException(Exception ex) {
        return new ApiResponse(400, ex.getMessage(), null);
    }


}
