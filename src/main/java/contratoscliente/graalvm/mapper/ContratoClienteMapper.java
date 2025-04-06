package contratoscliente.graalvm.mapper;

import contratoscliente.graalvm.controller.domain.ClausulaResponse;
import contratoscliente.graalvm.controller.domain.ClienteResponse;
import contratoscliente.graalvm.controller.domain.CondicoesCreditoResponse;
import contratoscliente.graalvm.controller.domain.ContratosClienteResponse;
import contratoscliente.graalvm.repository.entities.ClausulaEntity;
import contratoscliente.graalvm.repository.entities.ClienteEntity;
import contratoscliente.graalvm.repository.entities.CondicoesCreditoEntity;
import contratoscliente.graalvm.repository.entities.ContratoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ContratoClienteMapper {

    ContratoClienteMapper INSTANCE = Mappers.getMapper(ContratoClienteMapper.class);

    ContratosClienteResponse toResponse(ContratoEntity contrato);
    CondicoesCreditoResponse toResponse(CondicoesCreditoEntity condicoes);
    ClienteResponse toResponse(ClienteEntity cliente);
    ClausulaResponse toResponse(ClausulaEntity clausula);
}
