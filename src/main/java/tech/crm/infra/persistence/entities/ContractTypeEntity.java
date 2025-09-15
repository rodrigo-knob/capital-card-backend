package tech.crm.infra.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity(name = "contract_type")
public class ContractTypeEntity {

    @Id
    private UUID id = UUID.randomUUID();
    private String name;
    @OneToMany(mappedBy = "contractType")
    private List<ContractEntity> contractEntity;

    public ContractTypeEntity() {
    }

    public ContractTypeEntity(UUID id, String name, List<ContractEntity> contractEntity) {
        this.id = id;
        this.name = name;
        this.contractEntity = contractEntity;
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

    public List<ContractEntity> getContractEntity() {
        return contractEntity;
    }

    public void setContractEntity(List<ContractEntity> contractEntity) {
        this.contractEntity = contractEntity;
    }
}
