package com.ada.designpattern.adapter.problema;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrente {

    public static void main(String[] args) {
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jarConta);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

        if(client.validaSaldo(valorPretendidoParaSaque)) {  // 1a chamada
            client.saca(valorPretendidoParaSaque); // 2a chamada
        }
//        Para não depender de jars com vulnerabilidades ou erros,
//        Usa-se o adapter

        client.deposita(new BigDecimal(500)); // 3a chamada
    }
}
