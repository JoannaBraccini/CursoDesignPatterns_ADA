package com.ada.designpattern.strategy.solucao;

import com.ada.designpattern.strategy.Funcionario;
import com.ada.designpattern.strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class TesteAjusteSalarioComStrategy {

    public static void main(String[] args) {

        ReajusteAnualSalarioComStrategy reajusteAnualSalario = new ReajusteAnualSalarioComStrategy();

        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("João");
        funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(5000));

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Maria");
        funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
        funcionarioPJ.setSalario(new BigDecimal(10000));

        Funcionario funcionarioEstagio = new Funcionario();
        funcionarioEstagio.setNome("Pedro");
        funcionarioEstagio.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
        funcionarioEstagio.setSalario(new BigDecimal(3000));

//        Nova classe CCOP:
        Funcionario funcionarioCOOP = new Funcionario();
        funcionarioCOOP.setNome("Ana");
        funcionarioCOOP.setTipoContratacao(TipoContratacaoEnum.COOP);
        funcionarioCOOP.setSalario(new BigDecimal(8000));

//        Calcular os reajustes anuais
        reajusteAnualSalario.calculaReajusteAnual(funcionarioCLT, new CalculadorReajusteAnualSalarioCLT());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioPJ, new CalculadorReajusteAnualSalarioPJ());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioEstagio, new CalculadorReajusteAnualSalarioESTAGIO());

//        Agora basta adicionar novos tipos de contratação sem modificar o código existente, criando classes que implementam a interface e adicionando no Enum
        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);

//        Nova classe criada COOP:
        reajusteAnualSalario.calculaReajusteAnual(funcionarioCOOP, new CalculadorReajusteAnualSalarioCOOP());
        System.out.println(funcionarioCOOP);

//        SOLID: Fechado para alteração, aberto para extensão!
    }
}
