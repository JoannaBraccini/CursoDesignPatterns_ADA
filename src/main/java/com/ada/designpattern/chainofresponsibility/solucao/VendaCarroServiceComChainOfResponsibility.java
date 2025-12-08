package com.ada.designpattern.chainofresponsibility.solucao;

import com.ada.designpattern.chainofresponsibility.Carro;

import java.math.BigDecimal;

public class VendaCarroServiceComChainOfResponsibility {
//Ordem de cálculo da cadeia de responsabilidade
    public BigDecimal calculaValorVenda(Carro carro) {
        DescontoCarro desconto = new DescontoCarroBMW(
                new DescontoCarroAUDI(
                        new DescontoCarroValorMaiorQueCemMil(
                                new SemDireitoADesconto(
                                        null))));

        return desconto.aplicaDesconto(carro);
    }
    
}
