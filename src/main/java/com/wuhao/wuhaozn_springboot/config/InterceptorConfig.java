package com.wuhao.wuhaozn_springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

  @Value("${imagepath}")
  private String imagePath;//从配置文件中获取文件路径

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/pics/**")
//            .addResourceLocations("file: " + imagePath);
            .addResourceLocations("file:" + imagePath);
    System.out.println("InterceptorConfig imagePath = " + imagePath);
  }
}

