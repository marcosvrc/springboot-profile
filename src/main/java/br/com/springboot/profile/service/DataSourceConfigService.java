package br.com.springboot.profile.service;

import br.com.springboot.profile.config.datasource.DataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataSourceConfigService {

    private final DataSourceConfig dataSourceConfig;

    @Autowired
    public DataSourceConfigService(DataSourceConfig dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
    }

    public void setup() {
        dataSourceConfig.setup();
    }

}
