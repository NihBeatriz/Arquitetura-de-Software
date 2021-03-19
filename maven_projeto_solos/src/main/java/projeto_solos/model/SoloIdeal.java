package projeto_solos.model;

public class SoloIdeal {

    public double fosforoIdeal(int texturaSolo) {
        switch(texturaSolo) {
            case 1:
                return 9.0;
            case 2:
                return 12.0;
            default:
                return 0.0;
        }
    }

    public double potassioIdeal(int texturaSolo) {
        switch(texturaSolo) {
            case 1:
                return 0.35;
            case 2:
                return 0.25;
            default:
                return 0.0;
        }
    }

    public double calcioIdeal(int texturaSolo) {
        switch(texturaSolo) {
            case 1:
                return 6.0;
            case 2:
                return 4.0;
            default:
                return 0.0;
        }
    }

    public double magnesioIdeal(int texturaSolo) {
        switch(texturaSolo) {
            case 1:
                return 1.5;
            case 2:
                return 1.0;
            default:
                return 0.0;
        }
    }

    public double enxofreIdeal(int texturaSolo) {
        switch(texturaSolo) {
            case 1:
                return 9.0;
            case 2:
                return 6.0;
            default:
                return 0.0;
        }
    }

    public double aluminioIdeal(int texturaSolo) {
        switch(texturaSolo) {
            case 1:
                return 0.0;
            case 2:
                return 0.0;
            default:
                return 0.0;
        }
    }

    public double hAlIdeal(int texturaSolo) {
        switch(texturaSolo) {
            case 1:
                return 0.0;
            case 2:
                return 0.0;
            default:
                return 0.0;
        }
    }

    public String verificaSolo(int texturaSolo) {   
        String tipoSolo;

        switch(texturaSolo) {
            case 1:
                tipoSolo = "Solo Argiloso";
                break;
            case 2:
                tipoSolo = "Solo Textura Média";
                break;
            default:
                tipoSolo = "Valor de Solo Inválido";
                break;
        } 

        return tipoSolo;
    }
}