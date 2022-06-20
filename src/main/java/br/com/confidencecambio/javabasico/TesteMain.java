package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.models.Cliente;

public class TesteMain {

    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        cliente.setNome("Victor Duarte de Mendonça");

        System.out.println(cliente.nomeAbreviado(cliente.getNome()));
        System.out.println(cliente.primeiroNome(cliente.getNome()));
        System.out.println(cliente.ultimoNome(cliente.getNome()));

    }

}
