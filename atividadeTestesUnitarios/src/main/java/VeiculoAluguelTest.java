import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class VeiculoAluguelTest {

    @Test
    public void testCalcularValorTotalSemDesconto() {
        VeiculoAluguel aluguel = new VeiculoAluguel("Fusca", 100.0, 6);
        assertEquals(600.0, aluguel.calcularValorTotal(), 0.001);
    }

    @Test
    public void testCalcularValorTotalComDesconto() {
        VeiculoAluguel aluguel = new VeiculoAluguel("Fusca", 100.0, 7);
        assertEquals(630.0, aluguel.calcularValorTotal(), 0.001);
    }

    @Test
    public void testCalcularValorBruto() {
        VeiculoAluguel aluguel = new VeiculoAluguel("Fusca", 100.0, 7);
        assertEquals(700.0, aluguel.calcularValorBruto(100, 7), 0.001);
    }

    @Test
    public void testDescontoDisponivelTrue() {
        VeiculoAluguel aluguel = new VeiculoAluguel("Fusca", 100.0, 7);
        assertTrue(aluguel.descontoDisponivel(7));
    }

    @Test
    public void testDescontoDisponivelFalse() {
        VeiculoAluguel aluguel = new VeiculoAluguel("Gol", 100.0, 3);
        assertFalse(aluguel.descontoDisponivel(6));
    }

    @Test
    public void testCalcularPercentualDesconto7Dias() {
        VeiculoAluguel aluguel = new VeiculoAluguel("Gol", 100.0, 7);
        assertEquals(0.10, aluguel.calcularPercentualDesconto(7), 0.001);
    }

    @Test
    public void testCalcularPercentualDesconto14Dias() {
        VeiculoAluguel aluguel = new VeiculoAluguel("Gol", 100.0, 7);
        assertEquals(0.15, aluguel.calcularPercentualDesconto(14), 0.001);
    }

    @Test
    public void testCalcularPercentualDesconto30Dias() {
        VeiculoAluguel aluguel = new VeiculoAluguel("Gol", 100.0, 7);
        assertEquals(0.20, aluguel.calcularPercentualDesconto(30), 0.001);
    }

    @Test
    public void testcalcularValorTotalComDescontoAplicado() {
        VeiculoAluguel aluguel = new VeiculoAluguel("Gol", 100.0, 7);
        assertEquals(630.0, aluguel.calcularValorTotalComDescontoAplicado(700, 0.10), 0.001);
    }

}
