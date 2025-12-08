package com.ada.designpattern.chainofresponsibility.problema;

import com.ada.designpattern.chainofresponsibility.Carro;
import com.ada.designpattern.chainofresponsibility.Marca;

import java.math.BigDecimal;

public class VendaCarroService {
// Classe muito longa que tende a crescer com o tempo.
//    Para esse exemplo, usa-se o padrão Chain of Responsability.
    public BigDecimal calculaValorVenda(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();

//        Calcula desconto com base na marca do carro
        if (Marca.BMW.equals(carro.getMarca())) {
            return valorVenda.subtract(new BigDecimal(1000));
        }
        if (Marca.AUDI.equals(carro.getMarca())) {
            return valorVenda.subtract(new BigDecimal(2000));
        }
        if (carro.getPreco().compareTo(new BigDecimal(100000)) > 0) {
            return valorVenda.subtract(new BigDecimal(10000));
        }
        return valorVenda;
    }

}
