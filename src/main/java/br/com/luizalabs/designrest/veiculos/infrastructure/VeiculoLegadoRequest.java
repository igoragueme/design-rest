package br.com.luizalabs.designrest.veiculos.infrastructure;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VeiculoLegadoRequest {

    @JsonProperty("OPERACAO")
    private String operacao;

    @JsonProperty("VEICULO")
    private VeiculoLegado veiculo;

}
