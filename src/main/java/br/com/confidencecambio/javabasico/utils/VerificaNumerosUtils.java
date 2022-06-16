package br.com.confidencecambio.javabasico.utils;

import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class VerificaNumerosUtils {

    private static final Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public static boolean verificaCampos(String valor) {
        if (valor == null) {
            return false;
        }
        return pattern.matcher(valor).matches();
    }

}
