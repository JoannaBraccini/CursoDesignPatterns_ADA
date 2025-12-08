package com.ada.designpattern.chainofresponsibility.solucao;

import com.ada.designpattern.chainofresponsibility.Carro;
import com.ada.designpattern.chainofresponsibility.Marca;

import java.math.BigDecimal;

public class DescontoCarroBMW extends DescontoCarro{
    public DescontoCarroBMW(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if (Marca.BMW.equals(carro.getMarca())) {
            return valorVenda.subtract(new BigDecimal(1000));
        }
//        calcula desconto se for BMW,
//        se não manda para o proximo desconto
        return proximoDesconto.aplicaDesconto(carro);
    }
}
