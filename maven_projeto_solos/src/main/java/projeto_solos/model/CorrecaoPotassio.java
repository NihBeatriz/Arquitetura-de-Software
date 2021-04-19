package projeto_solos.model;

public class CorrecaoPotassio {

    public double calculoNecessidadePotassio(double potassioAtual, double potassioDesejado, double potassioCTC) {
        return (potassioAtual * potassioDesejado / potassioCTC) - potassioAtual;
    }

    public double calculoCmolCm3KEmMgDm3(double calculoNecessidadePotassio) {
        if (calculoNecessidadePotassio > 0.01) {
            return calculoNecessidadePotassio * 39.1 * 10;
        }

        return 0.0;
    }

    public double calculoMgDm3EmKgHa(double calculoCmolCm3KEmMgDm3) {
        return calculoCmolCm3KEmMgDm3 * 2;
    }

    public double calculoKgHaEmK2O(double calculoMgDm3EmKgHa) {
        return calculoMgDm3EmKgHa * 1.2;
    }

    public double calculoEficienciaPotassio(double calculoKgHaEmK2O, double eficienciaPotassio) {
        return calculoKgHaEmK2O / eficienciaPotassio;
    }

    public double calculoQuantidadeAplicar(double calculoEficienciaPotassio, double fontePotassio) {
        return calculoEficienciaPotassio * 100 / fontePotassio;
    }

    public double calculoQuantidadeAplicarKgHaEmKgAlqueire(double calculoQuantidadeAplicar) {
        return calculoQuantidadeAplicar * 2.42;
    }
    
    public double calculoCustoPorAlqueire(double precoFontePotassio, double calculoQuantidadeAplicarKgHaEmKgAlqueire) {
        return ((precoFontePotassio * calculoQuantidadeAplicarKgHaEmKgAlqueire) / 1000) / 2.42;
    }
}