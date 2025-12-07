package com.ada.designpattern.proxy.solucao;

import com.ada.designpattern.builder.Pessoa;
import com.ada.designpattern.proxy.PessoaService;

import java.time.LocalDate;

public class TestePessoaComProxy {
    public static void main(String[] args) {

        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
        PessoaService pessoaService = new PessoaService(new PessoaRepositoryProxy());

        NovoPessoaRepositoryProxy novoPessoaRepositoryProxy = new NovoPessoaRepositoryProxy();
        PessoaService pessoaService1 = new PessoaService(novoPessoaRepositoryProxy);

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
        Pessoa pessoaSalvaComCache = pessoaService.findById(1L);
        System.out.println(pessoaSalvaComCache);
    }
}
