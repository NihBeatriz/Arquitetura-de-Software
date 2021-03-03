package projeto_solos.model;

public class SoloIdeal {

    private double fosforoIdeal;
    private double potassioIdeal;
    private double calcioIdeal;
    private double magnesioIdeal;
    private double enxofreIdeal;
    private double aluminioIdeal;
    private double hAlIdeal;
    private String texturaSolo;

    public double getFosforoIdeal() {
        return fosforoIdeal;
    }

    public void setFosforoIdeal(double fosforoIdeal) {
        this.fosforoIdeal = fosforoIdeal;
    }

    public double getPotassioIdeal() {
        return potassioIdeal;
    }

    public void setPotassioIdeal(double potassioIdeal) {
        this.potassioIdeal = potassioIdeal;
    }
    public double getCalcioIdeal() {
        return calcioIdeal;
    }

    public void setCalcioIdeal(double calcioIdeal) {
        this.calcioIdeal = calcioIdeal;
    }
    public double getMagnesioIdeal() {
        return magnesioIdeal;
    }

    public void setMagnesioIdeal(double magnesioIdeal) {
        this.magnesioIdeal = magnesioIdeal;
    }
    public double getEnxofreIdeal() {
        return enxofreIdeal;
    }

    public void setEnxofreIdeal(double enxofreIdeal) {
        this.enxofreIdeal = enxofreIdeal;
    }

    public double getAluminioIdeal() {
        return aluminioIdeal;
    }

    public void setAluminioIdeal(double aluminioIdeal) {
        this.aluminioIdeal = aluminioIdeal;
    }

    public double getHAlIdeal() {
        return hAlIdeal;
    }

    public void setHAlIdeal(int hAlIdeal) {
        this.hAlIdeal = hAlIdeal;
    }

    public String getTexturaSolo() {
        return texturaSolo;
    }

    public void setTexturaSolo(String texturaSolo) {
        this.texturaSolo = texturaSolo;
    }

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
            System.out.println("\nValor Inválido!");
            System.exit(0);
        }
    }
}
