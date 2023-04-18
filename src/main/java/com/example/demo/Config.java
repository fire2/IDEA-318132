package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "demo.property.undetected")
public class Config {

  @Value("${demo.property.detected}")
  private String detectedProperty;

}
