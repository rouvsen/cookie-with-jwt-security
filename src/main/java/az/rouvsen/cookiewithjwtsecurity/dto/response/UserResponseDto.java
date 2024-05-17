package az.rouvsen.cookiewithjwtsecurity.dto.response;

import az.rouvsen.cookiewithjwtsecurity.model.UserRole;

import java.util.Set;

public class UserResponseDto {
    private Long id;
    private String username;
    private Set<UserRole> roles;
}
