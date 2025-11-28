package tech.crm.domain.gateway;

import java.util.List;
import tech.crm.domain.entities.Bank;

public interface BankGateway {

    List<Bank> findAll();

    void save(Bank bank);
}
