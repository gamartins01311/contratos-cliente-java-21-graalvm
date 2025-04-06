package contratoscliente.graalvm.controller;

import contratoscliente.graalvm.controller.domain.ContratosClienteResponse;
import contratoscliente.graalvm.facade.ContratosClienteFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContratosClienteController {

    @Autowired
    private ContratosClienteFacade contratosClienteFacade;

    @GetMapping("/contratos/vt/{cpfCnpj}")
    public List<ContratosClienteResponse> getContratosVirtualThread(@PathVariable("cpfCnpj") String cpfCnpj) {
        try {
            return contratosClienteFacade.buscarContratosClienteVirtualThread(cpfCnpj).get();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar contratos (VT)", e);
        }
    }

    @GetMapping("/contratos/novt/{cpfCnpj}")
    public List<ContratosClienteResponse> getContratosSemVirtualThread(@PathVariable("cpfCnpj") String cpfCnpj) {
        try {
            return contratosClienteFacade.buscarContratosClienteSemVirtualThread(cpfCnpj).get();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar contratos (sem VT)", e);
        }
    }

}
