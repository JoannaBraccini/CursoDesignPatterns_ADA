package com.ada.designpattern.chainofresponsibility.solucao;

import com.ada.designpattern.chainofresponsibility.Carro;
import com.ada.designpattern.chainofresponsibility.Marca;

import java.math.BigDecimal;

public class DescontoCarroAUDI extends DescontoCarro{
    public DescontoCarroAUDI(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if (Marca.AUDI.equals(carro.getMarca())) {
            return valorVenda.subtract(new BigDecimal(2000));
        }
//        calcula desconto se for AUDI,
//        se não manda para o proximo desconto
        return proximoDesconto.aplicaDesconto(carro);
    }
}
