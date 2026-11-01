package org.strategy;

public class ImpostoICMS implements Imposto {

    public float calcular(float valor) {
        return valor * 0.18f;
    }
}