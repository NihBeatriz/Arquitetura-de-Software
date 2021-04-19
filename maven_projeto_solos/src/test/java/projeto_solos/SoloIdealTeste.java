// Código desenvolvido com base na aula de Arquitetura de Software do professor Gabriel Costa Silva
package projeto_solos;

import static org.junit.Assert.*;
import org.junit.Test;
import projeto_solos.model.Nutrientes;
import projeto_solos.enums.SoloIdeal;

public class SoloIdealTeste {

    @Test
    public void testaSoloIdealArgiloso() {
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getFosforo(), 
            SoloIdeal.ARGILOSO.calculoSoloIdeal().getFosforo(), 0.0);

        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getPotassio(), 
            SoloIdeal.ARGILOSO.calculoSoloIdeal().getPotassio(), 0.0);
        
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getCalcio(), 
            SoloIdeal.ARGILOSO.calculoSoloIdeal().getCalcio(), 0.0);

        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getMagnesio(), 
            SoloIdeal.ARGILOSO.calculoSoloIdeal().getMagnesio(), 0.0);

        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getEnxofre(), 
            SoloIdeal.ARGILOSO.calculoSoloIdeal().getEnxofre(), 0.0);

        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getAluminio(), 
            SoloIdeal.ARGILOSO.calculoSoloIdeal().getAluminio(), 0.0);
        
        assertEquals(new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).gethAl(), 
            SoloIdeal.ARGILOSO.calculoSoloIdeal().gethAl(), 0.0);
    }
    
    @Test
    public void testaSoloIdealTexturaMedia() {
        assertEquals(new Nutrientes(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getFosforo(), 
            SoloIdeal.TEXTURA_MEDIA.calculoSoloIdeal().getFosforo(), 0.0);
                
        assertEquals(new Nutrientes(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getAluminio(), 
            SoloIdeal.TEXTURA_MEDIA.calculoSoloIdeal().getAluminio(), 0.0);

        assertEquals(new Nutrientes(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).gethAl(), 
            SoloIdeal.TEXTURA_MEDIA.calculoSoloIdeal().gethAl(), 0.0);

        assertEquals(new Nutrientes(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getCalcio(), 
            SoloIdeal.TEXTURA_MEDIA.calculoSoloIdeal().getCalcio(), 0.0);

        assertEquals(new Nutrientes(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getEnxofre(), 
            SoloIdeal.TEXTURA_MEDIA.calculoSoloIdeal().getEnxofre(), 0.0);

        assertEquals(new Nutrientes(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getMagnesio(), 
            SoloIdeal.TEXTURA_MEDIA.calculoSoloIdeal().getMagnesio(), 0.0);

        assertEquals(new Nutrientes(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getPotassio(), 
            SoloIdeal.TEXTURA_MEDIA.calculoSoloIdeal().getPotassio(), 0.0);
    }
}