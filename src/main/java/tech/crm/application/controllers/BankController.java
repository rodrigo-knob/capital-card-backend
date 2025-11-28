package tech.crm.application.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import tech.crm.application.responses.BankResponse;
import tech.crm.domain.entities.Bank;
import tech.crm.domain.services.BankService;
import tech.crm.infra.presenter.BankPresenter;

@Path("/bank")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BankController {

    private final BankService bankService;

    @Inject
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GET
    public List<BankResponse> findAll() {
        return bankService.findAll().stream()
            .map(BankPresenter::toResponse)
            .toList();
    }

    @POST
    public Response saveBank(Bank bank) {
        bankService.save(bank);
        return Response.ok().build();
    }
}
