package tech.crm.application.requests.user;

public record UserRequest(String username,
                          String name,
                          String email,
                          String password) {
}
