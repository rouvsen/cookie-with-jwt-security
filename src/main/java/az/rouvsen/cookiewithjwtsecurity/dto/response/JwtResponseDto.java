package az.rouvsen.cookiewithjwtsecurity.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtResponseDto {
    private String accessToken;
    private String token;
}
