package br.com.springboot.profile;

import br.com.springboot.profile.config.ServiceProperties;

import br.com.springboot.profile.service.DataSourceConfigService;
import br.com.springboot.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootProfileApplication implements CommandLineRunner {

	@Autowired
	private ServiceProperties serviceProperties;

	@Autowired
	private ProfileService profileService;

	@Autowired
	private DataSourceConfigService dataSourceConfigService;

	@Override
	public void run(String... args) {
		System.out.println(serviceProperties.toString());
		System.out.println(profileService.getConfigs());
		dataSourceConfigService.setup();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProfileApplication.class, args);
	}

}
