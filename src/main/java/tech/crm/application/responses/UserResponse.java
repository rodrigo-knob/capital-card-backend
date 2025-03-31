package tech.crm.application.responses;

import java.util.UUID;

public record UserResponse(UUID id,
                           String username,
                           String name,
                           String email) {
}
