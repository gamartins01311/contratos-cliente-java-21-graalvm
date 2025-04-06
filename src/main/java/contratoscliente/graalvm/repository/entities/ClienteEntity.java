package contratoscliente.graalvm.repository.entities;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpfCnpj;
    private String endereço;
    private String estadoCivil;
    private String profissao;
}
