package projeto_solos.enums;

public enum FontePotassio {
    
    CLORETO_DE_POTASSIO(58.0),
    SULFATO_DE_POTASSIO(52.0),
    SULFATO_DE_POTASSIO_E_MAGNESIO(22.0),
    NITRATO_DE_POTASSIO(44.0);

    private final double valor;

    private FontePotassio(double valor) {
        this.valor = valor;
    }
        
    public double getValor(){
        return this.valor;
    }
}