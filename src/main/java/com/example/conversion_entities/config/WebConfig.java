package com.example.conversion_entities.config;

import com.example.conversion_entities.converters.GroupToGroupDtoConverter;
import com.example.conversion_entities.converters.StudentToStudentDtoConvervter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    @Lazy
    ConversionService conversionService;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new GroupToGroupDtoConverter(conversionService));
        registry.addConverter(new StudentToStudentDtoConvervter());

    }
}