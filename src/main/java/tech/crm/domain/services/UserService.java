package tech.crm.domain.services;

import java.util.List;
import tech.crm.application.requests.user.FilterUserRequest;
import tech.crm.domain.entities.User;
import tech.crm.domain.gateway.UserGateway;

public class UserService {

    private final UserGateway userGateway;

    public UserService(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public List<User> findAll(FilterUserRequest userRequest) {
        return userGateway.findAll(userRequest);
    }

}
