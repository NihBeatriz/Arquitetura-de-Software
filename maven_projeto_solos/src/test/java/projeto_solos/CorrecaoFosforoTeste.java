package projeto_solos;

import static org.junit.Assert.*;
import org.junit.Test;
import projeto_solos.model.CorrecaoFosforo;
import projeto_solos.enums.FonteFosforo;

public class CorrecaoFosforoTeste {
    
    @Test
    public void testaCalculoMgDmEmKgHa() {
        assertEquals(6.82, 
            new CorrecaoFosforo().calculoMgDmEmKgHa(12.0, 8.59), 0.0);
    }

    @Test
    public void testaCalculoKgHaEmP2O5() {
        assertEquals(15.62, 
            new CorrecaoFosforo().calculoKgHaEmP2O5(6.82), 0.01);
    }

    @Test
    public void testaCalculoNecessidadeP2O5() {
        assertEquals(22.31,
            new CorrecaoFosforo().calculoNecessidadeP2O5(15.62, 0.70), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarSF() {
        assertEquals(123.95,
            new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, 
            FonteFosforo.SUPERFOSFATO_SIMPLES.getValor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarST() {
        assertEquals(54.42,
            new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, 
            FonteFosforo.SUPERFOSFATO_TRIPLO.getValor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarMAP() {
        assertEquals(46.48, 
            new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, 
            FonteFosforo.MAP.getValor()), 0.1);
    }

    @Test
    public void testaCalculoQuantidadeAplicarDAP() {
        assertEquals(49.58,
            new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, 
            FonteFosforo.DAP.getValor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarYoorin() {
        assertEquals(123.95,
            new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, 
            FonteFosforo.YOORIN.getValor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarArad() {
        assertEquals(67.61,
            new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, 
            FonteFosforo.FOSFATO_ARAD.getValor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarGafsa() {
        assertEquals(76.93,
            new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, 
            FonteFosforo.FOSFATO_GAFSA.getValor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarDaoui() {
        assertEquals(69.72,
            new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, 
            FonteFosforo.FOSFATO_DAOUI.getValor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarFPM() {
        assertEquals(92.96,
            new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, 
            FonteFosforo.FOSFATO_PATOS_MINAS.getValor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarET() {
        assertEquals(120.60,
            new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, 
            FonteFosforo.ESCORIA_DE_THOMAS.getValor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarAF() {
        assertEquals(42.91,
            new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, 
            FonteFosforo.ACIDO_FOSFORICO.getValor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarMM() {
        assertEquals(123.95,
            new CorrecaoFosforo().calculoQuantidadeAplicar(22.31, 
            FonteFosforo.MULTIFOSFATO_MAGNESIANO.getValor()), 0.01);
    }

    @Test
    public void testaCalculoQuantidadeAplicarKgHaEmKgAlqueire() {
        assertEquals(299.96,
            new CorrecaoFosforo().calculoQuantidadeAplicarKgHaEmKgAlqueire(123.95), 0.01);
    }

    @Test
    public void testaCalculoCustoPorHa() {
        assertEquals(61.98,
            new CorrecaoFosforo().calculoCustoPorHa(500.00, 299.96), 0.01);
    } 
    
    @Test
    public void testaCalculoNutrienteAdicionalEnxofreSS() {
        assertEquals(12.40,
            new CorrecaoFosforo().calculoNutrientesAdicionais(299.96, 
            FonteFosforo.SUPERFOSFATO_SIMPLES.getAdicionalEnxofre()), 0.01);
    } 

    @Test
    public void testaCalculoNutrienteAdicionalEnxofreMM() {
        assertEquals(13.63,
            new CorrecaoFosforo().calculoNutrientesAdicionais(299.96, 
            FonteFosforo.MULTIFOSFATO_MAGNESIANO.getAdicionalEnxofre()), 0.01);
    }

    @Test
    public void testaCalculoNutrienteAdicionalCalcioSS() {
        assertEquals(34.70,
            new CorrecaoFosforo().calculoNutrientesAdicionais(299.96, 
            FonteFosforo.SUPERFOSFATO_SIMPLES.getAdicionalCalcioOuNitrogenio()), 0.01);
    } 

    @Test
    public void testaCalculoNutrienteAdicionalCalcioST() {
        assertEquals(10.88,
            new CorrecaoFosforo().calculoNutrientesAdicionais(131.69, 
            FonteFosforo.SUPERFOSFATO_TRIPLO.getAdicionalCalcioOuNitrogenio()), 0.01);
    }

    @Test
    public void testaCalculoNutrienteAdicionalNitrogenioMAP() {
        assertEquals(4.18,
            new CorrecaoFosforo().calculoNutrientesAdicionais(112.48, 
            FonteFosforo.MAP.getAdicionalCalcioOuNitrogenio()), 0.01);
    }

    @Test
    public void testaCalculoNutrienteAdicionalNitrogenioDAP() {
        assertEquals(7.93,
            new CorrecaoFosforo().calculoNutrientesAdicionais(119.98, 
            FonteFosforo.DAP.getAdicionalCalcioOuNitrogenio()), 0.01);
    }

    @Test
    public void testaCalculoNutrienteAdicionalCalcioYoorin() {
        assertEquals(34.70,
            new CorrecaoFosforo().calculoNutrientesAdicionais(299.96, 
            FonteFosforo.YOORIN.getAdicionalCalcioOuNitrogenio()), 0.01);
    }

    @Test
    public void testaCalculoNutrienteAdicionalCalcioArad() {
        assertEquals(35.16,
            new CorrecaoFosforo().calculoNutrientesAdicionais(163.62, 
            FonteFosforo.FOSFATO_ARAD.getAdicionalCalcioOuNitrogenio()), 0.01);
    }

    @Test
    public void testaCalculoNutrienteAdicionalCalcioGafsa() {
        assertEquals(40.00,
            new CorrecaoFosforo().calculoNutrientesAdicionais(186.17, 
            FonteFosforo.FOSFATO_GAFSA.getAdicionalCalcioOuNitrogenio()), 0.01);
    }

    @Test
    public void testaCalculoNutrienteAdicionalCalcioDaoui() {
        assertEquals(31.37,
            new CorrecaoFosforo().calculoNutrientesAdicionais(168.72, 
            FonteFosforo.FOSFATO_DAOUI.getAdicionalCalcioOuNitrogenio()), 0.01);
    }

    @Test
    public void testaCalculoNutrienteAdicionalCalcioFPM() {
        assertEquals(26.02,
            new CorrecaoFosforo().calculoNutrientesAdicionais(224.96, 
            FonteFosforo.FOSFATO_PATOS_MINAS.getAdicionalCalcioOuNitrogenio()), 0.01);
    }

    @Test
    public void testaCalculoNutrienteAdicionalCalcioET() {
        assertEquals(53.06,
            new CorrecaoFosforo().calculoNutrientesAdicionais(291.85, 
            FonteFosforo.ESCORIA_DE_THOMAS.getAdicionalCalcioOuNitrogenio()), 0.01);
    }

    @Test
    public void testaCalculoNutrienteAdicionalCalcioAF() {
        assertEquals(0.0,
            new CorrecaoFosforo().calculoNutrientesAdicionais(103.84, 
            FonteFosforo.ACIDO_FOSFORICO.getAdicionalCalcioOuNitrogenio()), 0.01);
    }

    @Test
    public void testaCalculoNutrienteAdicionalCalcioMM() {
        assertEquals(22.31,
            new CorrecaoFosforo().calculoNutrientesAdicionais(299.96, 
            FonteFosforo.MULTIFOSFATO_MAGNESIANO.getAdicionalCalcioOuNitrogenio()), 0.01);
    }

    @Test
    public void testaCalculoNutrienteAdicionalMagnesioYoorin() {
        assertEquals(18.60,
            new CorrecaoFosforo().calculoNutrienteAdicionalMagnesio(123.95), 0.01);
    }
}