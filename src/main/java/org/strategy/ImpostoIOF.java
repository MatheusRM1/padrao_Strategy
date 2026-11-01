package org.strategy;

public class ImpostoIOF implements Imposto {

    public float calcular(float valor) {
        return valor * 0.038f;
    }
}