package projeto_solos;

import static org.junit.Assert.*;
import org.junit.Test;
import projeto_solos.model.CorrecaoPotassio;
import projeto_solos.model.FontePotassio;

public class CorrecaoPotassioTeste {
    
    @Test
    public void testaCalculoNecessidadePotassio() {
        assertEquals(0.24, 
            new CorrecaoPotassio().calculoNecessidadePotassio(0.15, 3.0, 1.2), 0.1);
    }

    @Test
    public void testaCalculoCmolCm3KEmMgDm3() {
        assertEquals(93.84, 
            new CorrecaoPotassio().calculoCmolCm3KEmMgDm3(0.24), 0.1);
    }
    
    @Test
    public void testaCalculoMgDm3EmKgHa() {
        assertEquals(187.68, 
            new CorrecaoPotassio().calculoMgDm3EmKgHa(93.84), 0.1);
    }
    
    @Test
    public void testaCalculoKgHaEmK2O() {
        assertEquals(225.22, 
            new CorrecaoPotassio().calculoKgHaEmK2O(187.68), 0.1);
    }

    @Test
    public void testaCalculoEficienciaPotassio() {
        assertEquals(264.96, 
            new CorrecaoPotassio().calculoEficienciaPotassio(225.22, 0.85), 0.1);
    }
    
    @Test
    public void testaCalculoQuantidadeAplicarCP() {
        assertEquals(456.82, 
            new CorrecaoPotassio().calculoQuantidadeAplicar(264.96, FontePotassio.CLORETO_DE_POTASSIO.valor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarSP() {
        assertEquals(509.53, 
            new CorrecaoPotassio().calculoQuantidadeAplicar(264.96, FontePotassio.SULFATO_DE_POTASSIO.valor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarSPM() {
        assertEquals(1204.36, 
            new CorrecaoPotassio().calculoQuantidadeAplicar(264.96, FontePotassio.SULFATO_DE_POTASSIO_E_MAGNESIO.valor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarNP() {
        assertEquals(602.18, 
            new CorrecaoPotassio().calculoQuantidadeAplicar(264.96, FontePotassio.NITRATO_DE_POTASSIO.valor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarKgHaEmKgAlqueire() {
        assertEquals(1105.50, 
            new CorrecaoPotassio().calculoQuantidadeAplicarKgHaEmKgAlqueire(456.82), 0.01);
    }

    @Test
    public void testaCalculoCustoPorAlqueire() {
        assertEquals(228.41, 
            new CorrecaoPotassio().calculoCustoPorAlqueire(500.00, 1105.50), 0.01);
    }
}