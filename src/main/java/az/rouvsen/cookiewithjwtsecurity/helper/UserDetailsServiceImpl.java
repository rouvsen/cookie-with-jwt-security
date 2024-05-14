package az.rouvsen.cookiewithjwtsecurity.helper;

import az.rouvsen.cookiewithjwtsecurity.model.UserInfo;
import az.rouvsen.cookiewithjwtsecurity.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LOGGER.debug("Entering in loadUserByUsername Method...");
        UserInfo user = userRepository.findByUsername(username).orElseThrow(() -> {
            LOGGER.error("Username not found: {}", username);
            return new UsernameNotFoundException("Could not found user..!!");
        });
        LOGGER.info("User Authenticated Successfully..!!!");
        return new CustomUserDetails(user);
    }
}
