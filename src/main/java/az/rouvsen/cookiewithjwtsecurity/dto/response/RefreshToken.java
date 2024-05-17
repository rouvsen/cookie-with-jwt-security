package az.rouvsen.cookiewithjwtsecurity.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class RefreshToken {
    private String token;
    private String username;
    private LocalDateTime expiryDate;
}
