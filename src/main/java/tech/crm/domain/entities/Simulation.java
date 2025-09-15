package tech.crm.domain.entities;

public class Simulation {

    private double releasedValue;
    private double debtValue;

    public Simulation(double releasedValue, double debtValue) {
        this.releasedValue = releasedValue;
        this.debtValue = debtValue;
    }

    public double getReleasedValue() {
        return releasedValue;
    }

    public void setReleasedValue(double releasedValue) {
        this.releasedValue = releasedValue;
    }

    public double getDebtValue() {
        return debtValue;
    }

    public void setDebtValue(double debtValue) {
        this.debtValue = debtValue;
    }
}
