package com.ada.designpattern.prototype.solucao;

import com.ada.designpattern.prototype.Botao;
import com.ada.designpattern.prototype.TipoBordaEnum;

import java.util.HashMap;
import java.util.Map;

public class BotaoRegistry {

    //registrar os protótipos
    private static Map<String, Botao> REGISTRY = new HashMap<>();

    static {
//        Ao invés de criar diversas subclasse dependentes
//        de Botao, cria as instâncias diretamente no registry
        REGISTRY.put("BOTAO_AMARELO", new Botao() {
            {
                setCor("amarelo");
                setLargura(100);
                setAltura(40);
                setTipoBorda(TipoBordaEnum.GROSSA);
            }
        });
        REGISTRY.put("BOTAO_VERMELHO", new Botao() {
            {
                setCor("vermelho");
                setLargura(100);
                setAltura(30);
                setTipoBorda(TipoBordaEnum.FINA);
            }
        });
        REGISTRY.put("BOTAO_AZUL", new Botao() {
            {
                setCor("azul");
                setLargura(125);
                setAltura(35);
                setTipoBorda(TipoBordaEnum.TRACEJADA);
            }
        });
    }

    public static Botao getBotao(String chave) {
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }

    public static void addRegistry(String chave, Botao botao) {
        REGISTRY.put(chave, botao);
    }
}
