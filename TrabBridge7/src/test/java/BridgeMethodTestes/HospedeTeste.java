package BridgeMethodTestes;

import BridgeMethod.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoordenadorTest {

    @Test
    void deveRetornarCustoHospedeCidadaoComun() {
        Profissao profissao = new CidadaoComun();
        Hospede hospede = new Hospede(3000.0f);
       hospede.setProfissao(profissao);
        assertEquals(3000.0f, hospede.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoHospedeInfluencer() {
        Profissao profissao = new Influencer();
        Hospede hospede = new  Hospede(3000.0f);
       hospede.setProfissao(profissao);
        assertEquals(2550.0f, hospede.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoHospedePolitico() {
        Profissao profissao = new Politico();
        Hospede hospede = new  Hospede(3000.0f);
        hospede.setProfissao(profissao);
        assertEquals(600.0f, hospede.calcularCusto(), 0.01f);
    }

}