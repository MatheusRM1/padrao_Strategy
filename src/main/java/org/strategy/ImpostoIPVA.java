package org.strategy;

public class ImpostoIPVA implements Imposto {

    public float calcular(float valor) {
        return valor * 0.04f;
    }
}