package br.com.confidencecambio.javabasico.models;

public abstract class ManipulaString {

    // NÃO ENCONTREI UM NOME MELHOR PARA A CLASSE

    public String primeiroNome (String s) {
        String[] valor = s.trim().split(" ");
        return valor[0];
    }

    public String ultimoNome (String s) {

        StringBuilder sb = new StringBuilder();
        String[] valor = s.trim().split(" ");
        int i;
        int qtoPalavras = valor.length;

        if (qtoPalavras > 1) {
            for (i = 1; i < qtoPalavras; i++) {
                sb.append(valor[i]).append(" ");
            }

            return sb.toString();
        } else {
            return valor[0];
        }
    }

    public String nomeAbreviado (String s) {
        StringBuilder sb = new StringBuilder();

        String[] valor = s.trim().split(" ");
        int i;
        int qtoPalavras = valor.length;

        if (qtoPalavras > 1) {
            for (i = 2; i < qtoPalavras; i++) {
                sb.append(valor[i]).append(" ");
            }
            return valor[0] + " " + valor[1].charAt(0) + ". " + sb;
        } else {
            return valor[0];
        }
    }

    public String toUpperCase(String s) {
        return s.toUpperCase();
    }

}
