package tech.crm.domain.gateway;

import java.util.List;
import tech.crm.application.requests.user.FilterUserRequest;
import tech.crm.domain.entities.User;

public interface UserGateway {

    List<User> findAll(FilterUserRequest userRequest);
}
