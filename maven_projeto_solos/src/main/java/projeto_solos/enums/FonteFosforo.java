package projeto_solos.enums;

public enum FonteFosforo {

    SUPERFOSFATO_SIMPLES(18.0), 
    SUPERFOSFATO_TRIPLO(41.0),
    MAP(48.0),
    DAP(45.0),
    YOORIN(18.0),
    FOSFATO_ARAD(33.0),
    FOSFATO_GAFSA(29.0),
    FOSFATO_DAOUI(32.0),
    FOFATO_PATOS_MINAS(24.0),
    ESCORIA_DE_THOMAS(18.5),
    ACIDO_FOSFORICO(52.0),
    MULTIFOSFATO_MAGNESIANO(18.0);

    private final double valor;

    private FonteFosforo(double valor) {
        this.valor = valor;
    }
        
    public double getValor(){
        return this.valor;
    }
}