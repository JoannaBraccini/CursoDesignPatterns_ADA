package com.ada.designpattern.chainofresponsibility.solucao;

import com.ada.designpattern.chainofresponsibility.Carro;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

//Classe não instanciável
@AllArgsConstructor
public abstract class DescontoCarro {
    protected DescontoCarro proximoDesconto;

    public abstract BigDecimal aplicaDesconto(Carro carro);
}
