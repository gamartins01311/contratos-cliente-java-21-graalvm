package contratoscliente.graalvm.controller.domain;

import lombok.Data;

@Data
public class ClienteResponse {

    private String nome;
    private String cpfCnpj;
    private String endereço;
    private String estadoCivil;
    private String profissao;
}
