package com.mediaactu.tech;

import com.mediaactu.tech.configuration.VaultConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class VaultConnexionApplication {


	private static Logger logger = LoggerFactory.getLogger(Logger.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(VaultConnexionApplication.class, args);
		VaultConfiguration vaultConfiguration = context.getBean(VaultConfiguration.class);
		logger.info("-----------------Login in vault: "+ vaultConfiguration.getLogin());
		logger.info("-----------------Password in vault: "+ vaultConfiguration.getPassword());

	}

}
