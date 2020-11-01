package com.rolon.quarkus.config;

import io.quarkus.arc.config.ConfigProperties;
import lombok.Data;

@ConfigProperties
@Data
public class GreetingConfig {
    private String name;
    private TechnologyConfig technology;

    @Data
    public static class TechnologyConfig{
        private String name;

    }
}
