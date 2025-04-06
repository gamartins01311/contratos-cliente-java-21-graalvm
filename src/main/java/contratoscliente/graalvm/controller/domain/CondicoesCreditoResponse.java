package contratoscliente.graalvm.controller.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class CondicoesCreditoResponse {

    private BigDecimal limiteAprovado;
    private BigDecimal taxaJurosMensal;
    private BigDecimal cet;
    private LocalDate vencimentoFatura;
    private boolean rotativoHabilitado;
}
