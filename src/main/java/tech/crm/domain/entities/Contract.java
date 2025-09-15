package tech.crm.domain.entities;

import java.util.UUID;

public class Contract {

    private UUID id;
    private ContractType contractType;
    private double coefficient;

    public Contract(UUID id, ContractType contractType, double coefficient) {
        this.id = id;
        this.contractType = contractType;
        this.coefficient = coefficient;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

}
