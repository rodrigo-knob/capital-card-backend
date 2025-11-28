package tech.crm.application.responses;

import java.util.List;
import java.util.UUID;
import tech.crm.domain.entities.Contract;

public record BankResponse(UUID id,
                           String name,
                           List<Contract> contracts) {
}
