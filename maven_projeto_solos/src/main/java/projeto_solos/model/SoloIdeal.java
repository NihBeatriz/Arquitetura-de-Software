package projeto_solos.model;

public class SoloIdeal {

    public double fosforoIdeal(String texturaSolo) {
        switch(texturaSolo) {
            case "1":
                return 9.0;
            case "2":
                return 12.0;
            default:
                return 0.0;
        }
    }

    public double potassioIdeal(String texturaSolo) {
        switch(texturaSolo) {
            case "1":
                return 0.35;
            case "2":
                return 0.25;
            default:
                return 0.0;
        }
    }

    public double calcioIdeal(String texturaSolo) {
        switch(texturaSolo) {
            case "1":
                return 6.0;
            case "2":
                return 4.0;
            default:
                return 0.0;
        }
    }

    public double magnesioIdeal(String texturaSolo) {
        switch(texturaSolo) {
            case "1":
                return 1.5;
            case "2":
                return 1.0;
            default:
                return 0.0;
        }
    }

    public double enxofreIdeal(String texturaSolo) {
        switch(texturaSolo) {
            case "1":
                return 9.0;
            case "2":
                return 6.0;
            default:
                return 0.0;
        }
    }

    public double aluminioIdeal(String texturaSolo) {
        switch(texturaSolo) {
            case "1":
                return 0.0;
            case "2":
                return 0.0;
            default:
                return 0.0;
        }
    }

    public double hAlIdeal(String texturaSolo) {
        switch(texturaSolo) {
            case "1":
                return 0.0;
            case "2":
                return 0.0;
            default:
                return 0.0;
        }
    }

    public void verificaSolo(String texturaSolo) {    
        if(texturaSolo.equals("1")) {
            System.out.println("\nSolo Argiloso\n");
        } else if(texturaSolo.equals("2")) {
            System.out.println("\nSolo Textura Média\n");
        } else {
            System.out.println("\nValor Inválido!\n");
            System.exit(0);
        }
    }
}