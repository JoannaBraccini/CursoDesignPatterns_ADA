package com.ada.designpattern.builder.solucao;

import com.ada.designpattern.builder.Pessoa;

import java.time.LocalDate;

public class TestePessoaComBuilder {

    public static void main(String[] args) {
        Pessoa pessoa =
                new Pessoa.PessoaBuilder()
                .nome("Joanna")
                .sobrenome("Braccini")
                .documento("123.456.789-00")
                .email("joanna@email.com")
                .apelido("Jo")
                .dataNascimento(LocalDate.of(1986, 9, 12))
                .build(); //chama o método para criar a pessoa

        System.out.println(pessoa);

        StringBuilder sb = new StringBuilder().append("Hello ").append("World");
        System.out.println(sb);
    }
}
