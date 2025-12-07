package com.ada.designpattern.strategy.solucao;

import com.ada.designpattern.strategy.Funcionario;

public class ReajusteAnualSalarioComStrategy {

    public void calculaReajusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculador) {
        calculador.calculaReajusteAnual(funcionario);
//        substitui todo if else pois os métodos estão encapsulados
//         nas classes que implementam a interface
//         CalculadorReajusteAnualSalario
    }
}
