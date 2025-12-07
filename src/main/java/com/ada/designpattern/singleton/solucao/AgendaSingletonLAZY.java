package com.ada.designpattern.singleton.solucao;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonLAZY {

    private static AgendaSingletonLAZY INSTANCE = null;

    private final Map<String, Boolean> diasDisponiveis = new HashMap<>();

//    private para evitar que outras classes criem instâncias novas
    private AgendaSingletonLAZY() {
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sábado", Boolean.TRUE);
    }
// Primeiro verifica se a intância já foi criada, ao invés de
// carregar a classe já com a instância junto (eager) e, além disso,
// não carrega a classe ao iniciar o programa
    public static AgendaSingletonLAZY getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AgendaSingletonLAZY();
            return INSTANCE;
        }
        return INSTANCE;
    }

    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }

    public void ocupar(String dia) {
        diasDisponiveis.replace(dia, Boolean.FALSE);
    }
}
