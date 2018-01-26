package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//(exclude = {ErrorMvcAutoConfiguration.class})
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("App Main class");
        ConfigurableApplicationContext appContext = SpringApplication.run(App.class, args);
        String appName = appContext.getApplicationName();
        System.out.println("AppName = "+appName);
    }
}
