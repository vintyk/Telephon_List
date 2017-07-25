package org.paginationdemo.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableAutoConfiguration
@ComponentScan("org.paginationdemo")
@EnableWebMvc
public class MyConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("persons");
        registry.addViewController("/adminEdit").setViewName("adminEdit");
        registry.addViewController("/login").setViewName("login");
    }

@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry
            .addResourceHandler("/resources/**")
            .addResourceLocations("/resources/");

    registry
            .addResourceHandler("/src/main/webapp/resources/**")
            .addResourceLocations("/src/main/webapp/resources/");
    registry
            .addResourceHandler("/templates/**")
            .addResourceLocations("/src/main/webapp/templates/");
    registry
            .addResourceHandler("/fragments/**")
            .addResourceLocations("/src/main/webapp/templates/fragments/");
    registry
            .addResourceHandler("/webapp/**/*")
            .addResourceLocations("/src/main/webapp/");
    }
}
