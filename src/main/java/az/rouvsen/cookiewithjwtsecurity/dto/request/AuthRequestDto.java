package az.rouvsen.cookiewithjwtsecurity.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthRequestDto {
    private String username;
    private String password;
}
