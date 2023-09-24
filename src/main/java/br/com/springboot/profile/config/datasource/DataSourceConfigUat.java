package br.com.springboot.profile.config.datasource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("uat")
public class DataSourceConfigUat implements DataSourceConfig{

    public void setup() {
        System.out.println("DataSourceConfigUat -> Environment: uat");
    }
}
