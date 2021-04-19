// Código desenvolvido com base na aula de Arquitetura de Software do professor Gabriel Costa Silva
package projeto_solos.enums;

import projeto_solos.model.Nutrientes;

public enum SoloIdeal {

    ARGILOSO {
        public Nutrientes calculoSoloIdeal() {
            return  new Nutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0); 
        }
    },    
    TEXTURA_MEDIA {
        public Nutrientes calculoSoloIdeal() {
            return new Nutrientes(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0);
        }
    };

    public abstract Nutrientes calculoSoloIdeal();
}