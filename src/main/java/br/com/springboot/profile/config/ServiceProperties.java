package br.com.springboot.profile.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("server")
@Data
public class ServiceProperties {

    private String environment;
    private String host;

    @Override
    public String toString() {
        return "ServerProperties --> Environment: " + environment + " - Host: " + host;
    }
}
