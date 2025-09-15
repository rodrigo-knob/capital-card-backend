package tech.crm.infra.mapper;

import tech.crm.domain.entities.User;
import tech.crm.infra.persistence.entities.UserEntity;

public class UserMapper {

    public static UserEntity toEntity(User user) {
        return new UserEntity(user.getId(), user.getUsername(), user.getName(), user.getEmail(), user.getPassword());
    }

    public static User toDomain(UserEntity userEntity) {
        return new User(userEntity.getId(), userEntity.getUsername(), userEntity.getName(), userEntity.getEmail(), userEntity.getPassword());
    }
}
