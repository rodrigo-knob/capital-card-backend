package tech.crm.infra.adapter;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;
import tech.crm.domain.entities.Bank;
import tech.crm.domain.gateway.BankGateway;
import tech.crm.infra.mapper.BankMapper;
import tech.crm.infra.persistence.entities.BankEntity;
import tech.crm.infra.persistence.repositories.BankRepository;

@ApplicationScoped
public class BankRepositoryGateway implements BankGateway {

    private final BankRepository bankRepository;

    @Inject
    public BankRepositoryGateway(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @Override
    public List<Bank> findAll() {
        return bankRepository.findAll().list().stream().map(BankMapper::toDomain).toList();
    }

    @Override
    @Transactional
    public void save(Bank bank) {
        bankRepository.persist(new BankEntity(bank.getName()));
    }
}
