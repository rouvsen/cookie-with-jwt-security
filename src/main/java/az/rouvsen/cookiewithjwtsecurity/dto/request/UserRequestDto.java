package az.rouvsen.cookiewithjwtsecurity.dto.request;

import az.rouvsen.cookiewithjwtsecurity.model.UserRole;

import java.util.Set;

public class UserRequestDto {
    private Long id;
    private String username;
    private String password;
    private Set<UserRole> roles;
}
