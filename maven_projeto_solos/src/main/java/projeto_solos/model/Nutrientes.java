// Código desenvolvido com base na aula de Arquitetura de Software do professor Gabriel Costa Silva
package projeto_solos.model;

public class Nutrientes {

    private double fosforo;
    private double potassio;
    private double calcio;
    private double magnesio;
    private double enxofre;
    private double aluminio;
    private double hAl;

    public Nutrientes(double fosforo, double potassio, double calcio, double magnesio, double enxofre, double aluminio, double hAl) {
        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
        this.aluminio = aluminio;
        this.hAl = hAl;
    }

    public double getFosforo() {
        return fosforo;
    }

    public double getPotassio() {
        return potassio;
    }

    public double getCalcio() {
        return calcio;
    }

    public double getMagnesio() {
        return magnesio;
    }

    public double getEnxofre() {
        return enxofre;
    }

    public double getAluminio() {
        return aluminio;
    }

    public double gethAl() {
        return hAl;
    }
}