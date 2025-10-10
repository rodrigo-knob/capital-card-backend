package tech.crm.infra.mapper;

import tech.crm.domain.entities.Contract;
import tech.crm.domain.entities.User;
import tech.crm.infra.persistence.entities.ContractEntity;
import tech.crm.infra.persistence.entities.UserEntity;

public class ContractMapper {

    public static ContractEntity toEntity(Contract contract) {
        return new ContractEntity(contract.getId(), ContractTypeMapper.toEntity(contract.getContractType()), );
    }

    public static User toDomain(UserEntity userEntity) {
        return new User(userEntity.getId(), userEntity.getUsername(), userEntity.getName(), userEntity.getEmail(), userEntity.getPassword());
    }
}
