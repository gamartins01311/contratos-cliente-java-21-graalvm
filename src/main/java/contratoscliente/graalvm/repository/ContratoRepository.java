package contratoscliente.graalvm.repository;

import contratoscliente.graalvm.repository.entities.ContratoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContratoRepository extends JpaRepository<ContratoEntity, Long> {
    List<ContratoEntity> findByClienteCpfCnpj(String cpfCnpj);
}
