package br.com.confidencecambio.javabasico.models;

import lombok.Data;
import org.springframework.util.StringUtils;

@Data
public class Gerente extends ManipulaString{

    private String nome;

    public void setNome(String nome) throws Exception {
        if (!StringUtils.isEmpty(nome)) {
            this.nome = nome;
        } else {
            throw new Exception("Campos não podem ser nulos ou vazios");
        }
    }

}
