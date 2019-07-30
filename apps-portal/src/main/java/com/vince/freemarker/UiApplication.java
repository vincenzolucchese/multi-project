package com.vince.freemarker;

import static java.util.Collections.singletonList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;


@SpringBootApplication
public class UiApplication {
	
    public UiApplication(FreeMarkerConfigurer freeMarkerConfigurer) {
        freeMarkerConfigurer.getTaglibFactory().setClasspathTlds(singletonList("/META-INF/security.tld"));
    }

    public static void main(String[] args) {
        SpringApplication.run(UiApplication.class, args);
    }
}