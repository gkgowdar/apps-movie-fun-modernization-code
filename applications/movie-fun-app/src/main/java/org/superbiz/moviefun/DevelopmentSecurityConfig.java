package org.superbiz.moviefun;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Profile("development")
@Configuration
//@ConditionalOnProperty(value = "application.oauth-enabled", havingValue = "false")
public class DevelopmentSecurityConfig {

    @LoadBalanced
    @Bean
    public RestOperations restOperations() {
        return new RestTemplate();
    }
}
