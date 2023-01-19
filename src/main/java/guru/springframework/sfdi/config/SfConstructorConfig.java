package guru.springframework.sfdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

// Immutable Bean - this can't be changed at runtime so can be more secure
//@ConstructorBinding - not working here after Spring Boot 3.0
@ConfigurationProperties("guru")
public class SfConstructorConfig {
    private final String username;
    private final String password;
    private final String jdbcurl;

    public SfConstructorConfig(String username, String password, String jdbcurl) {
        this.username = username;
        this.password = password;
        this.jdbcurl = jdbcurl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }
}
