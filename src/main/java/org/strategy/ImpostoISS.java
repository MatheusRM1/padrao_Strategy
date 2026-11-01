package org.strategy;

public class ImpostoISS implements Imposto {

    public float calcular(float valor) {
        return valor * 0.05f;
    }
}