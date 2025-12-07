package com.ada.designpattern.strategy;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class Funcionario {
    private String nome;
    private BigDecimal salario;
    private TipoContratacaoEnum tipoContratacao;

}
