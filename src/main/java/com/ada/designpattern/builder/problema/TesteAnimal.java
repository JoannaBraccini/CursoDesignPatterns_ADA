package com.ada.designpattern.builder.problema;

import com.ada.designpattern.builder.Animal;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = Animal.builder()
                .nome("Tobby")
                .dono("João")
                .raca("Poodle")
                .build();

        System.out.println(animal);
    }
}
