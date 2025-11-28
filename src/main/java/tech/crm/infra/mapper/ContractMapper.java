package tech.crm.infra.mapper;

import tech.crm.domain.entities.Contract;
import tech.crm.infra.persistence.entities.ContractEntity;

public class ContractMapper {

    public static ContractEntity toEntity(Contract contract) {
        return new ContractEntity(contract.getId(),
            ContractTypeMapper.toEntity(contract.getContractType()),
            BankMapper.toEntity(contract.getBank()),
            contract.getCoefficient());
    }

    public static Contract toDomain(ContractEntity contractEntity) {
        return new Contract(contractEntity.getId(),
            ContractTypeMapper.toDomain(contractEntity.getContractType()),
            contractEntity.getCoefficient(),
            BankMapper.toDomain(contractEntity.getBank()));
    }
}
