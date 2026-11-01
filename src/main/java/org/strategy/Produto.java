package org.strategy;

public class Produto {

    private float valor;

    public float getValor() {
        return valor;
    }

    public void calcularICMS(float valor) {
        CalculadoraImposto calculadora = new CalculadoraImposto(valor);
        this.valor = calculadora.calcular(new ImpostoICMS());
    }

    public void calcularISS(float valor) {
        CalculadoraImposto calculadora = new CalculadoraImposto(valor);
        this.valor = calculadora.calcular(new ImpostoISS());
    }

    public void calcularIPI(float valor) {
        CalculadoraImposto calculadora = new CalculadoraImposto(valor);
        this.valor = calculadora.calcular(new ImpostoIPI());
    }
}