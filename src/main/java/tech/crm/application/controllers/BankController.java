package tech.crm.application.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import tech.crm.application.requests.user.FilterUserRequest;
import tech.crm.application.responses.UserResponse;
import tech.crm.domain.services.UserService;
import tech.crm.infra.presenter.UserPresenter;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BankController {

    private final UserService userService;

    @Inject
    public BankController(UserService userService) {
        this.userService = userService;
    }

    @GET
    public List<UserResponse> findAll(@QueryParam("page") @DefaultValue("0") Integer page,
                                      @QueryParam("pageSize") @DefaultValue("10") Integer size,
                                      FilterUserRequest userRequest) {
        userRequest.setSize(size);
        userRequest.setPage(page);
        return userService.findAll(userRequest).stream()
            .map(UserPresenter::toResponse)
            .toList();
    }
}
