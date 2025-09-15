package tech.crm.domain.services;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import tech.crm.application.requests.user.FilterUserRequest;
import tech.crm.domain.entities.User;
import tech.crm.domain.gateway.UserGateway;

@ApplicationScoped
public class UserService {

    private final UserGateway userGateway;

    public UserService(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public List<User> findAll(FilterUserRequest userRequest) {
        return userGateway.findAll(userRequest);
    }

}
