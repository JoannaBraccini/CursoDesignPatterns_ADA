package com.ada.designpattern.singleton.solucao;

import java.util.HashMap;
import java.util.Map;
//Eager: carrega a classe ao iniciar o programa
public class AgendaSingletonEAGER {

//    Com uma instância ao invés de uma nova agenda a cada chamada
    private static final AgendaSingletonEAGER INSTANCE = new AgendaSingletonEAGER();

    private final Map<String, Boolean> diasDisponiveis = new HashMap<>();

//    private para evitar que outras classes criem instâncias novas
    private AgendaSingletonEAGER() {
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sábado", Boolean.TRUE);
    }

    public static AgendaSingletonEAGER getInstance() {
        return INSTANCE;
    }

    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }

    public void ocupar(String dia) {
        diasDisponiveis.replace(dia, Boolean.FALSE);
    }
}
