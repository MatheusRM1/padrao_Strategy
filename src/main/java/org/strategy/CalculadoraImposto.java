package org.strategy;

public class CalculadoraImposto {

    private float valor;

    public CalculadoraImposto(float valor) {
        this.valor = valor;
    }

    public float calcular(Imposto imposto) {
        return imposto.calcular(valor);
    }
}