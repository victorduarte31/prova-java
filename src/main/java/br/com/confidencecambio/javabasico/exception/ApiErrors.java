package br.com.confidencecambio.javabasico.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collections;
import java.util.List;

@Getter
@AllArgsConstructor
public class ApiErrors {

    List<String> apiErros;

    public ApiErrors(String message) {
        this.apiErros = Collections.singletonList(message);
    }
}
