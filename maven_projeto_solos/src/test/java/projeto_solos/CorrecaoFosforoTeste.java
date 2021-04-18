package projeto_solos;

import static org.junit.Assert.*;
import org.junit.Test;
import projeto_solos.model.CorrecaoFosforo;
import projeto_solos.model.FonteFosforo;

public class CorrecaoFosforoTeste {
    
    @Test
    public void testaCalculoMgDmEmKgHa() {
        assertEquals(6.82, new CorrecaoFosforo().calculoMgDmEmKgHa(12.0, 8.59), 0.0);
    }

    @Test
    public void testaCalculoKgHaEmP2O5() {
        assertEquals(15.6178, new CorrecaoFosforo().calculoKgHaEmP2O5(6.82), 0.01);
    }

    @Test
    public void testaCalculoNecessidadeP2O5() {
        assertEquals(22.31,
                new CorrecaoFosforo().calculoNecessidadeP2O5(15.6178, 0.70), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarSF() {
        assertEquals(123.95,
                new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, FonteFosforo.SUPERFOSFATO_SIMPLES.valor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarST() {
        assertEquals(54.42,
                new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, FonteFosforo.SUPERFOSFATO_TRIPLO.valor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarMAP() {
        assertEquals(46.48,
                new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, FonteFosforo.MAP.valor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarDAP() {
        assertEquals(49.58,
                new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, FonteFosforo.DAP.valor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarYoorin() {
        assertEquals(123.95,
                new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, FonteFosforo.YOORIN.valor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarArad() {
        assertEquals(67.61,
                new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, FonteFosforo.FOSFATO_ARAD.valor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarGafsa() {
        assertEquals(76.93,
                new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, FonteFosforo.FOSFATO_GAFSA.valor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarDaoui() {
        assertEquals(69.72,
                new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, FonteFosforo.FOSFATO_DAOUI.valor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarFPM() {
        assertEquals(92.96,
                new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, FonteFosforo.FOFATO_PATOS_MINAS.valor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarET() {
        assertEquals(120.60,
                new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, FonteFosforo.ESCORIA_DE_THOMAS.valor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarAF() {
        assertEquals(42.91,
                new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, FonteFosforo.ACIDO_FOSFORICO.valor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarMM() {
        assertEquals(123.95,
                new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, FonteFosforo.MULTIFOSFATO_MAGNESIANO.valor()), 0.01);
    }
}