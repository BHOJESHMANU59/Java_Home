package com.jspiders;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//replacement of spring.xml
@Configuration
@ComponentScan(basePackages = {"com.jspiders","com.jspiders.controller","com.jspiders.service","com.jspiders.entity","com.jspiders.repo"})
public class MultiplyConfig {

}
