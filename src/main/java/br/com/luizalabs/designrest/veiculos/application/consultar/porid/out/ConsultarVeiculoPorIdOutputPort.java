package br.com.luizalabs.designrest.veiculos.application.consultar.porid.out;

import java.time.LocalDateTime;

public interface ConsultarVeiculoPorIdOutputPort {

    Long getId();

    LocalDateTime getDataLance();

    String getLote();

    String getCodigoControle();

    String getMarca();

    String getModelo();

    Integer getAnoFabricacao();

    Integer getAnoModelo();

    Double getValorLance();

    String getUsuarioLance();

    Integer getLastPage();
}
