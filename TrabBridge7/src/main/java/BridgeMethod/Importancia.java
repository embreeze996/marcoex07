package BridgeMethod;

public abstract class Importancia {

    protected Profissao profissao;

    protected float custoBase;

    public Importancia(float custoBase) {
        this.custoBase = custoBase;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public void setCustoBase(float custoBase) {
        this.custoBase = custoBase;
    }

    public abstract float calcularCusto();
}
