package contratoscliente.graalvm.repository.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
public class ContratoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeContrato;
    private String numeroProduto;
    private String codigoProduto;
    private LocalDate dataInicioContrato;
    private LocalDate dataTerminoContrato;
    private BigDecimal multaAtraso;
    private BigDecimal jurosMora;
    private String politicaCancelamento;

    @OneToOne(cascade = CascadeType.ALL)
    private CondicoesCreditoEntity condicoes;

    @OneToMany(mappedBy = "contrato", cascade = CascadeType.ALL)
    private List<ClausulaEntity> clausulasEspeciais;

    @OneToOne(cascade = CascadeType.ALL)
    private ClienteEntity cliente;
}
