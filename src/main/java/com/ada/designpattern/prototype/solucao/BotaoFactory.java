package com.ada.designpattern.prototype.solucao;

import com.ada.designpattern.prototype.Botao;

public class BotaoFactory {
    public static Botao getInstance(Botao prototipo) {
        Botao clone = new Botao();
        clone.setCor(prototipo.getCor());
        clone.setLargura(prototipo.getLargura());
        clone.setAltura(prototipo.getAltura());
        clone.setTipoBorda(prototipo.getTipoBorda());
        return clone;
    }
}
