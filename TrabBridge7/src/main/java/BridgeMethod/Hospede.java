package BridgeMethod;

public class Hospede extends Importancia {

    public Hospede(float custoBase) {
        super(custoBase);
    }

    public float calcularCusto() {
        return this.custoBase * (1 + this.profissao.percentualDesconto());
    }

}