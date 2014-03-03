package com.example.spring4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Spring MCV configuration.
 * InternalResourceViewResolver is used and views are /WEB-INF/views/*.jsp
 * Static resources are configured to be in /resources (physically and via url).
 * 
 */
@EnableWebMvc
@Configuration
@ComponentScan("com.example.spring4.web")
public class SpringMVCConfig extends WebMvcConfigurerAdapter {
	
	/**
	 * Static resources configuration (js, css images).
	 */
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/").setCachePeriod(31556926);
    }
	
	/**
	 * Put all jsp pages under /WEB-INF/views.
	 */
    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
	
}
