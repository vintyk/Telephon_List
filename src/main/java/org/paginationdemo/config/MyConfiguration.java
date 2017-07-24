package org.paginationdemo.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableAutoConfiguration
@ComponentScan("org.paginationdemo")
@EnableWebMvc
public class MyConfiguration extends WebMvcConfigurerAdapter {

//    @Bean(name = "viewResolver")
//    public InternalResourceViewResolver getViewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix("/src/main/webapp/resources/");
//        viewResolver.setSuffix(".html");
//        return viewResolver;
//    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("*.html")
                .addResourceLocations("/src/main/webapp/**");
        registry
                .addResourceHandler("/src/main/webapp/resources/**")
                .addResourceLocations("/src/main/webapp/resources/");
        registry
                .addResourceHandler("/src/main/webapp/templates/**")
                .addResourceLocations("/src/main/webapp/templates/");
        registry
                .addResourceHandler("/webapp/**/*")
                .addResourceLocations("/src/main/webapp/");
    }
}
