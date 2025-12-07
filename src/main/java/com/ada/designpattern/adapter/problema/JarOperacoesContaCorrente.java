package com.ada.designpattern.adapter.problema;

import java.math.BigDecimal;

public class JarOperacoesContaCorrente {

    public boolean validaSaldo(BigDecimal valorPretendidoSaque) {
        System.out.println("Validando saldo...");
        return true;
    }

    public void saca(BigDecimal valorPretendido) {
        System.out.println("Sacando...");
    }

    public void deposita(BigDecimal valor) {
        System.out.println("Depositando...");
    }
}
