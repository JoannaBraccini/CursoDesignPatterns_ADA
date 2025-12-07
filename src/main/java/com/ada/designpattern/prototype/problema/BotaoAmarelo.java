package com.ada.designpattern.prototype.problema;

import com.ada.designpattern.prototype.Botao;
import com.ada.designpattern.prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {
    public BotaoAmarelo() {
        setCor("amarelo");
        setLargura(100);
        setAltura(40);
        setTipoBorda(TipoBordaEnum.GROSSA);
    }
}
