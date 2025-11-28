package tech.crm.infra.adapter;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;
import tech.crm.application.requests.user.FilterUserRequest;
import tech.crm.domain.entities.User;
import tech.crm.domain.gateway.UserGateway;
import tech.crm.infra.mapper.UserMapper;
import tech.crm.infra.persistence.repositories.UserRepository;

@ApplicationScoped
public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;

    @Inject
    public UserRepositoryGateway(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll(FilterUserRequest userRequest) {
        return userRepository.findAll()
            .stream()
            .map(UserMapper::toDomain)
            .toList();
    }
}
