package com.ada.designpattern.prototype.problema;

import com.ada.designpattern.prototype.Botao;
import com.ada.designpattern.prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {
    public BotaoVermelho() {
        setCor("vermelho");
        setLargura(100);
        setAltura(30);
        setTipoBorda(TipoBordaEnum.FINA);
    }
}
