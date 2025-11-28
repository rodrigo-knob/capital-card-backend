package tech.crm.infra.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity(name = "bank")
public class BankEntity {

    @Id
    private UUID id = UUID.randomUUID();
    private String name;
    @OneToMany(mappedBy = "bank")
    List<ContractEntity> contracts;

    public BankEntity() {
    }

    public BankEntity(String name) {
        this.name = name;
    }

    public BankEntity(String name, List<ContractEntity> contracts) {
        this.name = name;
        this.contracts = contracts;
    }

    public BankEntity(UUID id, String name, List<ContractEntity> contracts) {
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

    public List<ContractEntity> getContracts() {
        return contracts;
    }

    public void setContracts(List<ContractEntity> contracts) {
        this.contracts = contracts;
    }
}
