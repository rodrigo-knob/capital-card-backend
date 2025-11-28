package tech.crm.infra.persistence.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.UUID;
import tech.crm.infra.persistence.entities.BankEntity;

@ApplicationScoped
public class BankRepository implements PanacheRepositoryBase<BankEntity, UUID> {

}
