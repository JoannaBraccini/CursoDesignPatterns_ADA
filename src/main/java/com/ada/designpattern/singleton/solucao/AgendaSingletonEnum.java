package com.ada.designpattern.singleton.solucao;

import java.util.HashMap;
import java.util.Map;
//O método padrão para Singleton!
public enum AgendaSingletonEnum {

    INSTANCE;

    private final Map<String, Boolean> diasDisponiveis = new HashMap<>();

    //    private para evitar que outras classes criem instâncias novas
    AgendaSingletonEnum() {
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sábado", Boolean.TRUE);
    }

    //   método público estático para fornecer acesso à instância única
    public static AgendaSingletonEnum getInstance() {
        return INSTANCE;
    }

    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }

    public void ocupar(String dia) {
        diasDisponiveis.replace(dia, Boolean.FALSE);
    }
}
