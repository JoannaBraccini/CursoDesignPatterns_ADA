package com.ada.designpattern.strategy.solucao;

import com.ada.designpattern.strategy.Funcionario;

import java.math.BigDecimal;

public class CalculadorReajusteAnualSalarioCLT implements CalculadorReajusteAnualSalario{
    @Override
    public void calculaReajusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.multiply(BigDecimal.valueOf(1.10)));
    }
}
