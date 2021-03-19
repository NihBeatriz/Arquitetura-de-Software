package projeto_solos;

import static org.junit.Assert.*;
import org.junit.Test;
import projeto_solos.model.SoloIdeal;

public class AppTest 
{
    @Test
    public void testFosforo1() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 9.0;
        double resultado = soloIdeal.fosforoIdeal(1);

        assertEquals(resultadoEsperado, resultado, 0);
    }

    @Test
    public void testFosforo2() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 12.0;
        double resultado = soloIdeal.fosforoIdeal(2);

        assertEquals(resultadoEsperado, resultado, 0);
    }

    @Test
    public void testFosforoInvalido() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 0.0;
        double resultado = soloIdeal.fosforoIdeal(3);

        assertEquals(resultadoEsperado, resultado, 0);
    }
    
    @Test
    public void testPotassio1() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 0.35;
        double resultado = soloIdeal.potassioIdeal(1);

        assertEquals(resultadoEsperado, resultado, 0);
    }
    
    @Test
    public void testPotassio2() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 0.25;
        double resultado = soloIdeal.potassioIdeal(2);

        assertEquals(resultadoEsperado, resultado, 0);
    }

    @Test
    public void testPotassioInvalido() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 0.0;
        double resultado = soloIdeal.potassioIdeal(3);

        assertEquals(resultadoEsperado, resultado, 0);
    }
    
    @Test
    public void testCalcio1() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 6.0;
        double resultado = soloIdeal.calcioIdeal(1);

        assertEquals(resultadoEsperado, resultado, 0);
    }
    
    @Test
    public void testCalcio2() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 4.0;
        double resultado = soloIdeal.calcioIdeal(2);

        assertEquals(resultadoEsperado, resultado, 0);
    }

    @Test
    public void testCalcioInvalido() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 0.0;
        double resultado = soloIdeal.calcioIdeal(3);

        assertEquals(resultadoEsperado, resultado, 0);
    }
    
    @Test
    public void testMagnesio1() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 1.5;
        double resultado = soloIdeal.magnesioIdeal(1);

        assertEquals(resultadoEsperado, resultado, 0);
    }
    
    @Test
    public void testMagnesio2() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 1.0;
        double resultado = soloIdeal.magnesioIdeal(2);

        assertEquals(resultadoEsperado, resultado, 0);
    }

    @Test
    public void testMagnesioInvalido() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 0.0;
        double resultado = soloIdeal.magnesioIdeal(3);

        assertEquals(resultadoEsperado, resultado, 0);
    }
    
    @Test
    public void testEnxofre1() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 9.0;
        double resultado = soloIdeal.enxofreIdeal(1);

        assertEquals(resultadoEsperado, resultado, 0);
    }
    
    @Test
    public void testEnxofre2() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 6.0;
        double resultado = soloIdeal.enxofreIdeal(2);

        assertEquals(resultadoEsperado, resultado, 0);
    }

    @Test
    public void testEnxofreInvalido() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 0.0;
        double resultado = soloIdeal.enxofreIdeal(3);

        assertEquals(resultadoEsperado, resultado, 0);
    }
    
    @Test
    public void testAluminio1() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 0.0;
        double resultado = soloIdeal.aluminioIdeal(1);

        assertEquals(resultadoEsperado, resultado, 0);
    }
    
    @Test
    public void testAluminio2() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 0.0;
        double resultado = soloIdeal.aluminioIdeal(2);

        assertEquals(resultadoEsperado, resultado, 0);
    }

    @Test
    public void testAluminioInvalido() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 0.0;
        double resultado = soloIdeal.aluminioIdeal(3);

        assertEquals(resultadoEsperado, resultado, 0);
    }
    
    @Test
    public void testHAl1() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 0.0;
        double resultado = soloIdeal.hAlIdeal(1);

        assertEquals(resultadoEsperado, resultado, 0);
    }
    
    @Test
    public void testHAl2() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 0.0;
        double resultado = soloIdeal.hAlIdeal(2);

        assertEquals(resultadoEsperado, resultado, 0);
    }

    @Test
    public void testHAlInvalido() {
        SoloIdeal soloIdeal = new SoloIdeal();
        double resultadoEsperado = 0.0;
        double resultado = soloIdeal.hAlIdeal(3);

        assertEquals(resultadoEsperado, resultado, 0);
    }

    @Test
    public void testVerificaSolo1() {
        SoloIdeal soloIdeal = new SoloIdeal();
        String resultadoEsperado = "Solo Argiloso";
        String resultado = soloIdeal.verificaSolo(1);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testVerificaSolo2() {
        SoloIdeal soloIdeal = new SoloIdeal();
        String resultadoEsperado = "Solo Textura Média";
        String resultado = soloIdeal.verificaSolo(2);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testVerificaSoloInvalido() {
        SoloIdeal soloIdeal = new SoloIdeal();
        String resultadoEsperado = "Valor de Solo Inválido";
        String resultado = soloIdeal.verificaSolo(3);

        assertEquals(resultadoEsperado, resultado);
    }
}