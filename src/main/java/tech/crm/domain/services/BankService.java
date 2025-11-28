package tech.crm.domain.services;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import tech.crm.domain.entities.Bank;
import tech.crm.domain.gateway.BankGateway;

@ApplicationScoped
public class BankService {

    private final BankGateway bankGateway;

    public BankService(BankGateway bankGateway) {
        this.bankGateway = bankGateway;
    }

    public List<Bank> findAll() {
        return bankGateway.findAll();
    }

    public void save(Bank bank) {
        bankGateway.save(bank);
    }

}
