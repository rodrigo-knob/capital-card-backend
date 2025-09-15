package tech.crm.infra.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.UUID;

@Entity(name = "contract")
public class ContractEntity {

    @Id
    private UUID id = UUID.randomUUID();
    @ManyToOne
    private ContractTypeEntity contractType;
    @ManyToOne
    private BankEntity bank;
    private double coefficient;

    public ContractEntity() {
    }

    public ContractEntity(UUID id, ContractTypeEntity contractType, BankEntity bank, double coefficient) {
        this.id = id;
        this.contractType = contractType;
        this.bank = bank;
        this.coefficient = coefficient;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ContractTypeEntity getContractType() {
        return contractType;
    }

    public void setContractType(ContractTypeEntity contractType) {
        this.contractType = contractType;
    }

    public BankEntity getBank() {
        return bank;
    }

    public void setBank(BankEntity bank) {
        this.bank = bank;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

}
