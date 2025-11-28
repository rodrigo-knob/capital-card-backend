package tech.crm.infra.mapper;

import java.util.Collections;
import tech.crm.domain.entities.ContractType;
import tech.crm.infra.persistence.entities.ContractTypeEntity;

public class ContractTypeMapper {

    private ContractTypeMapper() {}

    public static ContractTypeEntity toEntity(ContractType contractType) {
        return new ContractTypeEntity(contractType.getId(), contractType.getName(), Collections.emptyList());
    }

    public static ContractType toDomain(ContractTypeEntity contractTypeEntity) {
        return new ContractType(contractTypeEntity.getId(),
            contractTypeEntity.getName(),
            contractTypeEntity.getContractEntity().stream().map(ContractMapper::toDomain).toList());
    }
}
