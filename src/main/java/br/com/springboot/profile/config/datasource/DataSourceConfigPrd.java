package br.com.springboot.profile.config.datasource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Profile("prod")
public class DataSourceConfigPrd implements DataSourceConfig {

    public void setup() {
        System.out.println("DataSourceConfigPrd -> Environment: prod");
    }
}
