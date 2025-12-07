package com.ada.designpattern.proxy;

import com.ada.designpattern.builder.Pessoa;
import com.ada.designpattern.proxy.solucao.ProxyPessoa;

public class PessoaService {
    private ProxyPessoa proxyPessoa;

    public PessoaService(ProxyPessoa proxyPessoa) {
        this.proxyPessoa = proxyPessoa;
    }
    public void save(Pessoa pessoa) {
        proxyPessoa.save(pessoa);
    }
    public Pessoa findById(Long id) {
        return proxyPessoa.findById(id);
    }
}
