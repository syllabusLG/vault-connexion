package com.mediaactu.tech.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VaultConfiguration {

    @Getter @Setter
    @Value("${login}")
    private String login;
    @Getter @Setter
    @Value(("${password}"))
    private String password;

}
