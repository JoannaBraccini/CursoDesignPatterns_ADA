package com.ada.designpattern.factorymethods.solucao;

import com.ada.designpattern.factorymethods.Produto;
import com.ada.designpattern.factorymethods.ProdutoDigital;
import com.ada.designpattern.factorymethods.ProdutoFisico;
import com.ada.designpattern.factorymethods.TipoProdutoEnum;

public class ProdutoFactory {

    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {

        switch (tipoProdutoEnum) {
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;
            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return new ProdutoDigital();
            default:
                throw new IllegalArgumentException("Tipo de produto não disponível");
        }
    }
}
