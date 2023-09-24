package br.com.springboot.profile.config.datasource;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DataSourceConfigDev implements DataSourceConfig{

    public void setup() {
        System.out.println("DataSourceConfigDev -> Environment: dev");
    }
}
