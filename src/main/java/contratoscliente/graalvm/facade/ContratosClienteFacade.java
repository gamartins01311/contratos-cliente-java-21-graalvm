package contratoscliente.graalvm.facade;


import contratoscliente.graalvm.controller.domain.ContratosClienteResponse;
import contratoscliente.graalvm.service.ContratoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Component
public class ContratosClienteFacade {

    @Autowired
    private ContratoClienteService contratoService;


    public Future<List<ContratosClienteResponse>> buscarContratosClienteVirtualThread(String cpfCnpj) {
        var executor = Executors.newVirtualThreadPerTaskExecutor();
        return executor.submit(() -> contratoService.buscarContratosCliente(cpfCnpj));
    }
    public CompletableFuture<List<ContratosClienteResponse>> buscarContratosClienteSemVirtualThread(String cpfCnpj) {
        return CompletableFuture.supplyAsync(() -> contratoService.buscarContratosCliente(cpfCnpj));
    }
}
