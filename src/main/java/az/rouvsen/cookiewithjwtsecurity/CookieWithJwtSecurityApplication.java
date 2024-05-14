package az.rouvsen.cookiewithjwtsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.SecureRandom;
import java.util.Base64;

@SpringBootApplication
public class CookieWithJwtSecurityApplication {

    public static void main(String[] args) {
//        generateBase64SecretKey();
        SpringApplication.run(CookieWithJwtSecurityApplication.class, args);
    }

    private static void generateBase64SecretKey() {
        byte[] randomBytes = new byte[32];
        new SecureRandom().nextBytes(randomBytes);
        String base64SecretKey = Base64.getUrlEncoder().encodeToString(randomBytes);
        System.out.println(base64SecretKey);
    }

}
