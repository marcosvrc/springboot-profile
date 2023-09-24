package br.com.springboot.profile.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Value("${server.environment}")
    private String environment;

    @Value("${server.host}")
    private String host;

    public String getConfigs(){
        return "ProfileService ----> Environment: " + environment + " - Host: " + host;
    }
}
