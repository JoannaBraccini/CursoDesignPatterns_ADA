package com.ada.designpattern.adapter.solucao;

import com.ada.designpattern.adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrenteAdapter {
    public static void main(String[] args) {
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente(); //Jar original para o adapter trabalhar
        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);//adapter faz adaptação em cima do jar existente
        ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

        client.saca(valorPretendidoParaSaque); // 1a chamada
        client.deposita(new BigDecimal(500)); // 2a chamada
    }
}
