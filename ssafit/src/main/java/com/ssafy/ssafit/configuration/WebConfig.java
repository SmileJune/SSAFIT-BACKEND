package com.ssafy.ssafit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.BeanNameViewResolver;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
	
	@Bean
	public ViewResolver beanViewResolver() {
		BeanNameViewResolver bvr = new BeanNameViewResolver();
		bvr.setOrder(0);
		return bvr;
	}
}
