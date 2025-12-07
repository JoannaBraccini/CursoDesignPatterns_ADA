package com.ada.designpattern.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Botao {
    protected String cor;
    protected int largura;
    protected int altura;
    protected TipoBordaEnum tipoBorda;
}
