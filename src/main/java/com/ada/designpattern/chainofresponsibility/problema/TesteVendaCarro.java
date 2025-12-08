package com.ada.designpattern.chainofresponsibility.problema;

import com.ada.designpattern.chainofresponsibility.Carro;
import com.ada.designpattern.chainofresponsibility.Marca;

import java.math.BigDecimal;

public class TesteVendaCarro {

    public static void main(String[] args) {
        VendaCarroService vendaCarroService = new VendaCarroService();

        /*Carro carro1 = new Carro();
        carro1.setMarca(Marca.BMW);
        carro1.setModelo("X5");
        carro1.setPreco(new BigDecimal(50000));

        BigDecimal valorVenda1 = vendaCarroService.calculaValorVenda(carro1);
        System.out.println("Valor da venda do " +  carro1.getModelo() + ": " + carro1.getPreco());
        System.out.println("Valor da venda do " +  carro1.getModelo() + " com desconto: " + valorVenda1);

        Carro carro2 = new Carro();
        carro2.setMarca(Marca.AUDI);
        carro2.setModelo("A4");
        carro2.setPreco(new BigDecimal(90000));

        BigDecimal valorVenda2 = vendaCarroService.calculaValorVenda(carro2);
        System.out.println("Valor da venda do " +  carro2.getModelo() + ": " + carro2.getPreco());
        System.out.println("Valor da venda do " +  carro2.getModelo() + " com desconto: " + valorVenda2);

        Carro carro3 = new Carro();
        carro3.setMarca(Marca.TOYOTA);
        carro3.setModelo("Corolla");
        carro3.setPreco(new BigDecimal(110000));

        BigDecimal valorVenda3 = vendaCarroService.calculaValorVenda(carro3);
        System.out.println("Valor da venda do " +  carro3.getModelo() + ": " + carro3.getPreco());
        System.out.println("Valor da venda do " +  carro3.getModelo() + " com desconto: " + valorVenda3);
    */}

}
