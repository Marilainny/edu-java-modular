package edu.javamodular.core;

import edu.javamodular.calculadora.Calculadora;

public class Running {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.div(15, 3));
    }
}
