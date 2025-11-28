package tech.crm.infra.mapper;

import tech.crm.domain.entities.Bank;
import tech.crm.infra.persistence.entities.BankEntity;

public class BankMapper {

    private BankMapper() {}

    public static BankEntity toEntity(Bank bank) {
        return new BankEntity(bank.getId(), bank.getName(), bank.getContracts().stream().map(ContractMapper::toEntity).toList());
    }

    public static Bank toDomain(BankEntity bankEntity) {
        return new Bank(bankEntity.getId(), bankEntity.getName(), bankEntity.getContracts().stream().map(ContractMapper::toDomain).toList());
    }

}
