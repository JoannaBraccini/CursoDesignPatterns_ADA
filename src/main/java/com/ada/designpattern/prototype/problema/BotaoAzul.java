package com.ada.designpattern.prototype.problema;

import com.ada.designpattern.prototype.Botao;
import com.ada.designpattern.prototype.TipoBordaEnum;

public class BotaoAzul extends Botao {

    public BotaoAzul() {
        setCor("azul");
        setLargura(125);
        setAltura(35);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
