package contratoscliente.graalvm.repository.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class ClausulaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "contrato_id")
    private ContratoEntity contrato;
}
