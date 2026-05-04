package padroescomportamentais.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Padrão Strategy — Hamburgueria")
class PedidoTest {

    private static final float DELTA = 0.01f;
    private Pedido pedido;

    @BeforeEach
    void setUp() {
        pedido = new Pedido();
    }

    @Test
    @DisplayName("PrecoNormal: 3 hambúrgueres de R$20,00 = R$60,00")
    void testCalcularPrecoNormal() {
        pedido.calcularPrecoNormal(20.00f, 3);
        assertEquals(60.00f, pedido.getPreco(), DELTA);
    }

    @Test
    @DisplayName("PrecoComDesconto: 2 hambúrgueres de R$30,00 com 10% off = R$54,00")
    void testCalcularPrecoComDesconto() {
        pedido.calcularPrecoComDesconto(30.00f, 2);
        assertEquals(54.00f, pedido.getPreco(), DELTA);
    }

    @Test
    @DisplayName("PrecoCombo: 3 hambúrgueres de R$25,00 pague 2 leve 3 = R$50,00")
    void testCalcularPrecoComboGrupoCompleto() {
        pedido.calcularPrecoCombo(25.00f, 3);
        assertEquals(50.00f, pedido.getPreco(), DELTA);
    }

    @Test
    @DisplayName("PrecoCombo: 4 hambúrgueres de R$25,00 = R$75,00")
    void testCalcularPrecoComboComResto() {
        pedido.calcularPrecoCombo(25.00f, 4);
        assertEquals(75.00f, pedido.getPreco(), DELTA);
    }

    @Test
    @DisplayName("PrecoComTaxaEntrega: 2 hambúrgueres de R$20,00 + R$5,00 = R$45,00")
    void testCalcularPrecoComTaxaEntrega() {
        pedido.calcularPrecoComTaxaEntrega(20.00f, 2);
        assertEquals(45.00f, pedido.getPreco(), DELTA);
    }

    @Test
    @DisplayName("PrecoComTaxaEntrega: quantidade zero lança IllegalArgumentException")
    void testCalcularPrecoComTaxaEntregaQuantidadeZero() {
        assertThrows(IllegalArgumentException.class,
                () -> pedido.calcularPrecoComTaxaEntrega(20.00f, 0));
    }

    @Test
    @DisplayName("PrecoPromocional: 4 hambúrgueres de R$20,00 / 2 = R$40,00")
    void testCalcularPrecoPromocional() {
        pedido.calcularPrecoPromocional(20.00f, 4);
        assertEquals(40.00f, pedido.getPreco(), DELTA);
    }

    @Test
    @DisplayName("Calculadora com PrecoNormal: R$15,00 x 4 = R$60,00")
    void testCalculadoraIsolada() {
        Calculadora calculadora = new Calculadora(15.00f, 4);
        assertEquals(60.00f, calculadora.calcular(new PrecoNormal()), DELTA);
    }
}