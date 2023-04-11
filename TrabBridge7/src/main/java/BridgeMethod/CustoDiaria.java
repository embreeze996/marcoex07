package BridgeMethod;

public class CustoDiaria extends Importancia {

    public CustoDiaria(float custoBase) {
        super(custoBase);
    }

    public float calcularCusto() {
        return this.custoBase;
    }
}