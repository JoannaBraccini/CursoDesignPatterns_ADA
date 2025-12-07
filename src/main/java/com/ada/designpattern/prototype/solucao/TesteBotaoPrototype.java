package com.ada.designpattern.prototype.solucao;

import com.ada.designpattern.prototype.Botao;
import com.ada.designpattern.prototype.TipoBordaEnum;

public class TesteBotaoPrototype {
    public static void main(String[] args) {
        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo);

        Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        System.out.println(botaoVermelho);

        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);

        botaoAmarelo.setLargura(200);
        System.out.println(botaoAmarelo);

//        Um 'clone' do botão amarelo original do registry
        Botao botaoAmareloClone = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.printf("Amarelo Clone: %s%n", botaoAmareloClone);

// Criar um novo botão (de cor diferente):
        String chave = "BOTAO_PRETO";
        Botao botaoPreto = new Botao();
        botaoPreto.setCor("Preto");
        botaoPreto.setLargura(300);
        botaoPreto.setAltura(50);
        botaoPreto.setTipoBorda(TipoBordaEnum.FINA);

        BotaoRegistry.addRegistry(chave, botaoPreto);
        Botao botaoPretoClone = BotaoRegistry.getBotao(chave);
        System.out.printf("Preto: %s%n", botaoPretoClone);
    }
}
