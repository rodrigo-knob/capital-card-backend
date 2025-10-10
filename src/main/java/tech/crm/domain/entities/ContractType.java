package tech.crm.domain.entities;

import java.util.List;
import java.util.UUID;

public class ContractType {

    private UUID id;
    private String name;
    private List<Contract> contract;

    public ContractType(UUID id, String name, List<Contract> contract) {
        this.id = id;
        this.name = name;
        this.contract = contract;
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

    public List<Contract> getContract() {
        return contract;
    }

    public void setContract(List<Contract> contract) {
        this.contract = contract;
    }
}
