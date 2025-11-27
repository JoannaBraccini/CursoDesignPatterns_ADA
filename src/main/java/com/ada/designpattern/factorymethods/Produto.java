package com.ada.designpattern.factorymethods;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Produto {
    private String descricao;
    private BigDecimal preco;
    private boolean possuiDimensoesFisicas;
}
