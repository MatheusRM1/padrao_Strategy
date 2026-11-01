import org.strategy.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveCalcularICMSProduto() {
        Produto produto = new Produto();
        produto.calcularICMS(100.0f);
        assertEquals(18.0f, produto.getValor());
    }

    @Test
    void deveCalcularISSProduto() {
        Produto produto = new Produto();
        produto.calcularISS(100.0f);
        assertEquals(5.0f, produto.getValor());
    }

    @Test
    void deveCalcularIPIProduto() {
        Produto produto = new Produto();
        produto.calcularIPI(100.0f);
        assertEquals(10.0f, produto.getValor());
    }

    @Test
    void deveCalcularIPVAProduto() {
        Produto produto = new Produto();
        produto.calcularIPVA(100.0f);
        assertEquals(4.0f, produto.getValor());
    }

    @Test
    void deveCalcularIOFProduto() {
        Produto produto = new Produto();
        produto.calcularIOF(100.0f);
        assertEquals(3.8f, produto.getValor());
    }

}