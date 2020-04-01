package com.hackathon.coronasampark.enums;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@PropertySource("classpath:enum.properties")
@PropertySource("classpath:validation-messages.properties")
public class FieldsEnum {


}
