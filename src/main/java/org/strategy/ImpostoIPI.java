package org.strategy;

public class ImpostoIPI implements Imposto {

    public float calcular(float valor) {
        return valor * 0.10f;
    }
}
