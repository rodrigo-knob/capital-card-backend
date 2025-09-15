package tech.crm.infra.persistence.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class ContractRepository implements PanacheRepositoryBase<ContractRepository, UUID> {

}
