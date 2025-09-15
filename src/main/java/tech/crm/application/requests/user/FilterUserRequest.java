package tech.crm.application.requests.user;

import tech.crm.application.requests.Pageable;

public class FilterUserRequest extends Pageable {
    private String username;
    private String name;
    private String email;
    private String password;

    public FilterUserRequest() {
    }

    public FilterUserRequest(Integer page, Integer size, String username, String name, String email, String password) {
        super(page, size);
        this.username = username;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
