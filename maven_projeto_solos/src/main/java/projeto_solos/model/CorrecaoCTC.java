// Código desenvolvido com base na aula de Arquitetura de Software do professor Gabriel Costa Silva
package projeto_solos.model;

public class CorrecaoCTC {
    
    private double sCmol;
    private double ctcCmol;

    public double calculoSCmol(double potassio, double calcio, double magnesio) {
        sCmol = potassio + calcio + magnesio;
        return sCmol;
    }

    public double calculoCTCCmol(double sCmol, double hAl) {
        ctcCmol = sCmol + hAl;
        return ctcCmol;
    }

    public double calculoVPercentual(double sCmol, double ctcCmol) {
        if(sCmol > 0 && ctcCmol > 0) {
            return (sCmol * 100) / ctcCmol;
        } else {
            return 0.0;
        }
    }

    public double calculoMoPercentual(double mo) {
        if(mo > 0) {
            return mo / 10;
        } else {
            return 0.0;
        }
    }

    public double calculoCarbono(double moPercentual) {
        if(moPercentual > 0) {
            return (moPercentual / 1.72) * 10;
        } else {
            return 0.0;
        }
    }
}
