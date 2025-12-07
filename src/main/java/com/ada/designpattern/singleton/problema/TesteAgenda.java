package com.ada.designpattern.singleton.problema;

public class TesteAgenda {
    public static void main(String[] args) {
        reservar("Sexta");
        reservar("Sábado");

    }

    public static void reservar(String dia) {
        Agenda agenda = new Agenda();
        agenda.ocupar(dia);
        System.out.println(agenda.getDias());
    }
}
