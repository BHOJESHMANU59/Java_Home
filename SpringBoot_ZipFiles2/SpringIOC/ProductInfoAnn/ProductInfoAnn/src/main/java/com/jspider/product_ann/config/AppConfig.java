package com.jspider.product_ann.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = "")
@ComponentScan(basePackages = "com.jspider.product_ann")
@Configuration
public class AppConfig {

}
