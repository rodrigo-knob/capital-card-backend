package tech.crm.infra.mapper;

import tech.crm.domain.entities.Bank;
import tech.crm.domain.entities.User;
import tech.crm.infra.persistence.entities.BankEntity;
import tech.crm.infra.persistence.entities.UserEntity;

public class BankMapper {

    public static BankEntity toEntity(Bank bank) {
        return new BankEntity(bank.getId(), bank.getName(), bank.getContracts());
    }

    public static User toDomain(UserEntity userEntity) {
        return new User(userEntity.getId(), userEntity.getUsername(), userEntity.getName(), userEntity.getEmail(), userEntity.getPassword());
    }
}
