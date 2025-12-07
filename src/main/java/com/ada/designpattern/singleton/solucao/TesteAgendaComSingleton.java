package com.ada.designpattern.singleton.solucao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgendaComSingleton {
//    exceptions criadas para o exemplo de reflection
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Teste Eager
        /*AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
        AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda2);

        reservarEAGER("Sexta");
        reservarEAGER("Sábado");*/

//        Teste Lazy
        /*AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda2);

        reservarLAZY("Sexta");
        reservarLAZY("Sábado");*/

// reflection: quebra o singleton, é impedido ao usar ENUM
        /*Constructor<AgendaSingletonLAZY> construtorTravesso = AgendaSingletonLAZY.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true); //torna o construtor que era privado em publico
        AgendaSingletonLAZY agendaTravessa = construtorTravesso.newInstance();
        AgendaSingletonLAZY agendaTravessa2 = construtorTravesso.newInstance();
*/
// Teste Enum
        AgendaSingletonEnum agenda1 = AgendaSingletonEnum.getInstance();
        AgendaSingletonEnum agenda2 = AgendaSingletonEnum.getInstance();
        System.out.println(agenda1.hashCode());
        System.out.println(agenda2.hashCode());
// Tentando usar reflection retorna uma exception
        Constructor<AgendaSingletonEnum> construtorTravesso = AgendaSingletonEnum.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true);
        AgendaSingletonEnum agendaTravessa = construtorTravesso.newInstance();
        AgendaSingletonEnum agendaTravessa2 = construtorTravesso.newInstance();
        System.out.println(agendaTravessa.hashCode());
        System.out.println(agendaTravessa2.hashCode());

        reservarEnum("Sexta");
        reservarEnum("Sábado");
    }

    public static void reservarEAGER(String dia) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupar(dia);
        System.out.println(agenda.getDias());
    }
    public static void reservarLAZY(String dia) {
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupar(dia);
        System.out.println(agenda.getDias());
    }
    public static void reservarEnum(String dia) {
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        agenda.ocupar(dia);
        System.out.println(agenda.getDias());
    }
}
