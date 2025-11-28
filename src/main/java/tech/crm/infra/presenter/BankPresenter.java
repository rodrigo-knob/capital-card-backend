package tech.crm.infra.presenter;

import tech.crm.application.responses.BankResponse;
import tech.crm.domain.entities.Bank;

public class BankPresenter {

    private BankPresenter() {}

    public static BankResponse toResponse(Bank bank) {
        return new BankResponse(bank.getId(), bank.getName(), bank.getContracts());
    }

}
