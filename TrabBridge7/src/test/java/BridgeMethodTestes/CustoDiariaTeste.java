package BridgeMethodTestes;

import BridgeMethod.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustoDiariaTeste {

    @Test
    void deveRetornarCustoParaCidadaoComun() {
        Profissao profissao = new CidadaoComun();
        CustoDiaria custoDiaria = new CustoDiaria(3000.0f);
        custoDiaria.setProfissao(profissao);
        assertEquals(3000.0f, custoDiaria.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoParaInfluencer() {
        Profissao profissao = new Influencer();
        CustoDiaria custoDiaria = new CustoDiaria(3000.0f);
        custoDiaria.setProfissao(profissao);
        assertEquals(3000.0f, custoDiaria.calcularCusto(), 0.01f);
    }
    @Test
    void deveRetornarCustoParaPolitico() {
        Profissao profissao = new Politico();
        CustoDiaria custoDiaria = new CustoDiaria(3000.0f);
        custoDiaria.setProfissao(profissao);
        assertEquals(3000.0f, custoDiaria.calcularCusto(), 0.01f);
    }

}