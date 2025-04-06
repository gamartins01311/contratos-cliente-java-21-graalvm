package contratoscliente.graalvm.service;

import contratoscliente.graalvm.controller.domain.ContratosClienteResponse;
import contratoscliente.graalvm.mapper.ContratoClienteMapper;
import contratoscliente.graalvm.repository.ContratoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContratoClienteService {

    @Autowired
    private ContratoRepository contratoRepository;

    @Autowired
    private ContratoClienteMapper contratoClienteMapper;

    @Transactional
    public List<ContratosClienteResponse> buscarContratosCliente(String cpfCnpj) {
        var contratos = contratoRepository.findByClienteCpfCnpj(cpfCnpj);
        return contratos.stream()
                .map(contratoClienteMapper::toResponse)
                .toList();
    }
}
