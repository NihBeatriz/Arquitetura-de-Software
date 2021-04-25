package projeto_solos.enums;

public enum FonteFosforo {

    SUPERFOSFATO_SIMPLES(18.0, 0.1, 0.28),
    SUPERFOSFATO_TRIPLO(41.0, 0.0, 0.2),
    MAP(48.0, 0.0, 0.09),
    DAP(45.0, 0.0, 0.16),
    YOORIN(18.0, 0.0, 0.28),
    FOSFATO_ARAD(33.0, 0.0, 0.52),
    FOSFATO_GAFSA(29.0, 0.0, 0.52),
    FOSFATO_DAOUI(32.0, 0.0, 0.45),
    FOSFATO_PATOS_MINAS(24.0, 0.0, 0.28),
    ESCORIA_DE_THOMAS(18.5, 0.0, 0.44),
    ACIDO_FOSFORICO(52.0, 0.0, 0.0),
    MULTIFOSFATO_MAGNESIANO(18.0, 0.11, 0.18);

    private final double valor;
    private final double adicionalEnxofre;
    private final double adicionalCalcioOuNitrogenio;

    private FonteFosforo(double valor, double adicionalEnxofre, double adicionalCalcioOuNitrogenio) {
        this.valor = valor;
        this.adicionalEnxofre = adicionalEnxofre;
        this.adicionalCalcioOuNitrogenio = adicionalCalcioOuNitrogenio;
    }
        
    public double getValor(){
        return this.valor;
    }

    public double getAdicionalEnxofre(){
        return this.adicionalEnxofre;
    }

    public double getAdicionalCalcioOuNitrogenio(){
        return this.adicionalCalcioOuNitrogenio;
    }
}