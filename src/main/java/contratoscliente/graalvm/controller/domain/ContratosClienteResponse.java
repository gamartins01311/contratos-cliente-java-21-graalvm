package contratoscliente.graalvm.controller.domain;

import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class ContratosClienteResponse {
    private String nomeContrato;
    private String numeroProduto;
    private String codigoProduto;
    private CondicoesCreditoResponse condicoes;
    private LocalDate dataInicioContrato;
    private LocalDate dataTerminoContrato;
    private BigDecimal multaAtraso;
    private BigDecimal jurosMora;
    private String politicaCancelamento;
    private List<ClausulaResponse> clausulasEspeciais;
    private ClienteResponse cliente;
}
