package com.ada.designpattern.proxy.solucao;

import com.ada.designpattern.builder.Pessoa;
import com.ada.designpattern.proxy.PessoaRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;
// Muito usado para logs quando não pode mexer em alguma classe
// Também usado para fazer cache
public class PessoaRepositoryProxy extends PessoaRepository implements ProxyPessoa {
    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());
//    cache simulado
    private Map<Long, Pessoa> cache = new HashMap<>();

    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando chamada de método save...");
        super.save(pessoa);
        log.info("Chamada de método save finalizada.");
    }
    @Override
    public Pessoa findById(Long id) {
        log.info("Iniciando chamada de método findById...");
        long inicio = System.currentTimeMillis();
        Pessoa pessoa = null;
        if(Objects.nonNull(cache.get(id))){
            log.info("Buscando no cache...");
            pessoa = cache.get(id);
        } else {
            log.info("Buscando no banco PessoaRepository...");
            pessoa = super.findById(id);
            cache.put(id, pessoa);
        }
        log.info("Chamada de método findById finalizada.");
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - inicio) + " ms");

        return pessoa;
    }
}
