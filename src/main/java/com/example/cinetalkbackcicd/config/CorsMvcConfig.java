package com.example.cinetalkbackcicd.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class CorsMvcConfig implements WebMvcConfigurer {

    // test
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {

        corsRegistry.addMapping("/**")
                .exposedHeaders("Set-Cookie")
                .exposedHeaders("access")
                .exposedHeaders("refresh")
                .allowedOrigins("http://localhost:63342")
                .allowCredentials(true);
    }
}
