package com.ada.designpattern.chainofresponsibility;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class Carro {
    private Marca marca;
    private String modelo;
    private BigDecimal preco;
}
