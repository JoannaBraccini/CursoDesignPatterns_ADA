package com.ada.designpattern.proxy.problema;

import com.ada.designpattern.builder.Pessoa;
import com.ada.designpattern.proxy.PessoaRepository;
import com.ada.designpattern.proxy.PessoaService;

import java.time.LocalDate;

public class PessoaTest {
    /*public static void main(String[] args) {
        PessoaService pessoaService = new PessoaService(new PessoaRepository());
        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .nome("João")
                .sobrenome("Silva")
                .email("joao.silva@example.com")
                .apelido("Joãozinho")
                .dataNascimento(LocalDate.of(1990, 1, 1))
                .documento("123.456.789-00")
                .build();
        pessoaService.save(pessoa);
        Pessoa pessoaSalva = pessoaService.findById(1L);
        System.out.println(pessoaSalva);
    }*/
}
