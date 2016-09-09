package com.prast.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.prast.rest.RestControl;

@Configuration
public class AppConfig {

	@Bean
	public AppProperties appProps() {
		return new AppProperties();
	}

	@Bean
	public RestControl restControl() {
		return new RestControl();
	}

}
