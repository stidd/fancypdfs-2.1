package com.steventidd.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.steventidd.ApplicationLauncher;
import com.steventidd.service.InvoiceService;
import com.steventidd.service.UserService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackageClasses = ApplicationLauncher.class)
@PropertySource("classpath:/application.properties")
@PropertySource(value = "classpath:/application-${spring.profiles.active}.properties", ignoreResourceNotFound = true)
public class MyFancyPdfInvoicesApplicationConfiguration {


    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }



}
