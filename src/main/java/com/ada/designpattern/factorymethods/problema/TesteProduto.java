package com.ada.designpattern.factorymethods.problema;

import com.ada.designpattern.factorymethods.ProdutoDigital;
import com.ada.designpattern.factorymethods.ProdutoFisico;

public class TesteProduto {

    public static void main(String[] args) {

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);
    }
}
