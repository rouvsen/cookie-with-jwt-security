package az.rouvsen.cookiewithjwtsecurity.service;

import az.rouvsen.cookiewithjwtsecurity.dto.response.RefreshToken;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class RefreshTokenService {

    public RefreshToken createRefreshToken(String username) {
        String token = UUID.randomUUID().toString();
        return new RefreshToken(token, username, LocalDateTime.now().plusDays(7));
    }
}
