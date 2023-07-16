package com.ex.springCore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.ex.springCore")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
