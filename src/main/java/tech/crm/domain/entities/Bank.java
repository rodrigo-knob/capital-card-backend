package tech.crm.domain.entities;

import java.util.List;
import java.util.UUID;

public class Bank {

    private UUID id;
    private String name;
    private List<Contract> contracts;

    public Bank(UUID id, String name, List<Contract> contracts) {
        this.id = id;
        this.name = name;
        this.contracts = contracts;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public Simulation simulateValue(Contract contract, Integer installmentNumber) {
        double releasedValue = installmentNumber / contract.getCoefficient();
        double debtValue = installmentNumber * 24.0;

        return new Simulation(releasedValue, debtValue);

    }
}
