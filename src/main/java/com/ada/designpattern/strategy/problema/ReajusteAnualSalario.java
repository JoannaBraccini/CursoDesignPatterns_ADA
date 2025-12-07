package com.ada.designpattern.strategy.problema;

import com.ada.designpattern.strategy.Funcionario;
import com.ada.designpattern.strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteAnualSalario {

    public void calculaReajusteAnual(Funcionario funcionario) {
//classe que precisa de alteração de código para nova regra de negócio
//        Para isso se usa Strategy: uma estratégia para cada modelo de contratação
        if(TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacao().name())) {
            BigDecimal salario = funcionario.getSalario();
//            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));
            funcionario.setSalario(salario.multiply(BigDecimal.valueOf(1.10)));
        } else if (TipoContratacaoEnum.PJ.equals(funcionario.getTipoContratacao())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.multiply(BigDecimal.valueOf(1.05)));
        } else if (TipoContratacaoEnum.ESTAGIO.equals(funcionario.getTipoContratacao())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.multiply(BigDecimal.valueOf(1.02)));
        }
    }
}
