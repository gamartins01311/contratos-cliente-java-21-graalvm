package contratoscliente.graalvm.repository.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
public class CondicoesCreditoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal limiteAprovado;
    private BigDecimal taxaJurosMensal;
    private BigDecimal cet;
    private LocalDate vencimentoFatura;
    private boolean rotativoHabilitado;
}
