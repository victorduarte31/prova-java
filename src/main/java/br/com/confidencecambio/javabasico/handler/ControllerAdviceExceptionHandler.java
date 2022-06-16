package br.com.confidencecambio.javabasico.handler;


import br.com.confidencecambio.javabasico.exception.ApiErrors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class ControllerAdviceExceptionHandler {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ApiErrors> handleResponseStatusException(ResponseStatusException ex) {
        String mensagemErro = ex.getReason();
        HttpStatus status = ex.getStatus();
        var apiErrors = new ApiErrors(mensagemErro);

        return new ResponseEntity<>(apiErrors, status);
    }

}
