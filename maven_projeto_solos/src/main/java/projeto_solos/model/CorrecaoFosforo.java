package projeto_solos.model;

public class CorrecaoFosforo {

    public double calculoMgDmEmKgHa(double fosforoAtingir, double fosforoAtual) {
        if(fosforoAtingir - fosforoAtual > 0.01) {
            return (fosforoAtingir - fosforoAtual) * 2.0;
        }

        return 0.0;
    }

    public double calculoKgHaEmP2O5(double calculoMgDmEmKgHa) {
        return calculoMgDmEmKgHa * 2.29;
    }

    public double calculoNecessidadeP2O5(double calculoKgHaEmP2O5, double eficienciaFosforo) {
        return calculoKgHaEmP2O5 / eficienciaFosforo;
    }

    public double calculoQuantidadeAplicar(double calculoNecessidadeP2O5, double fonteFosforo) {
        return (calculoNecessidadeP2O5 * 100) / fonteFosforo;
    }
}