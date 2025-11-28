package tech.crm.infra.presenter;

import tech.crm.application.responses.UserResponse;
import tech.crm.domain.entities.User;

public class UserPresenter {

    private UserPresenter() {}

    public static UserResponse toResponse(User user) {
        return new UserResponse(user.getId(), user.getUsername(), user.getName(), user.getEmail());
    }

}
