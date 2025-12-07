package com.ada.designpattern.proxy;

import com.ada.designpattern.builder.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class PessoaRepository {

    private final Map<Long, Pessoa> banco = new HashMap<>();
    private static Long countId = 1L;

    public void save(Pessoa pessoa) {
        banco.put(countId++, pessoa);
    }
    public Pessoa findById(Long id) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return banco.get(id);
    }
}
