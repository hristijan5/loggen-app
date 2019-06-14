package com.softcomint.loggen.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "application")
public class ApplicationProperties {

    private Elasticsearch elasticsearch;

    @Getter
    @Setter
    public static class Elasticsearch {
        private String path = "192.168.99.100:9200";
    }

}
