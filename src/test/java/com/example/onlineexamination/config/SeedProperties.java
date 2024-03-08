package com.example.onlineexamination.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties (prefix = "seed")
public class SeedProperties {
    private Boolean enabled;
}
