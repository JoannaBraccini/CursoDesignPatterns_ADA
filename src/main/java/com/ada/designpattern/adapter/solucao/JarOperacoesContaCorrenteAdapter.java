package com.ada.designpattern.adapter.solucao;

import com.ada.designpattern.adapter.problema.JarOperacoesContaCorrente;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class JarOperacoesContaCorrenteAdapter {
//    Composição para simular o uso do Jar
    private JarOperacoesContaCorrente jarConta;

    public void saca(BigDecimal valorPretendido) {
        if(jarConta.validaSaldo(valorPretendido)) {
            jarConta.saca(valorPretendido);
        } else {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }

    public void deposita(BigDecimal valor) {
        jarConta.deposita(valor);
    }

}
