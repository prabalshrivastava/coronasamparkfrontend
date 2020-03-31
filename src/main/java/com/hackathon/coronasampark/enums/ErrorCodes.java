package com.hackathon.coronasampark.enums;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:errorcode.properties")
public class ErrorCodes {
    @Value("${error.biz.cardNotFound}")
    public static String BIZ001;

    @Value("${error.tech.somethingWrong}")
    public static String BIZ002;
}
