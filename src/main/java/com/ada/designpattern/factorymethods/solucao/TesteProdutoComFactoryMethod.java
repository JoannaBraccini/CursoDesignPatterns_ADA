package com.ada.designpattern.factorymethods.solucao;

import com.ada.designpattern.factorymethods.Produto;
import com.ada.designpattern.factorymethods.TipoProdutoEnum;

public class TesteProdutoComFactoryMethod {

    public static void main(String[] args) {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);


    }
}
