package com.hackathon.coronasampark.custom;

import com.hackathon.coronasampark.custom.annotations.ValidateEnum;
import com.hackathon.coronasampark.enums.FieldsEnum;
import lombok.SneakyThrows;

import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EnumValidator implements ConstraintValidator<ValidateEnum, String> {

    @Inject
    private FieldsEnum fieldsEnum;
    private ValidateEnum validateEnum;


    @Override
    public void initialize(ValidateEnum constraintAnnotation) {
        this.validateEnum = constraintAnnotation;
    }

    @SneakyThrows
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        String fieldName = validateEnum.fieldName();
        String messageFieldName = fieldName + "Message";

        PropertyDescriptor fieldPropertyDescriptor = new PropertyDescriptor(fieldName, FieldsEnum.class);
        PropertyDescriptor messagePropertyDescriptor = new PropertyDescriptor(messageFieldName, FieldsEnum.class);

        Object fieldGetter = fieldPropertyDescriptor.getReadMethod().invoke(fieldsEnum);
        String messageGetter = (String) messagePropertyDescriptor.getReadMethod().invoke(fieldsEnum);

        List<String> enumValues = new ArrayList<>();
        String message = "";

        if (!Objects.isNull(fieldGetter) && fieldGetter instanceof List) {
            enumValues = (List<String>) fieldGetter;
        }
        if (!Objects.isNull(messageGetter) && messageGetter instanceof String) {
            message = messageGetter;
        }

        constraintValidatorContext.disableDefaultConstraintViolation();
        constraintValidatorContext
                .buildConstraintViolationWithTemplate(message)
                .addConstraintViolation();
        return enumValues.contains(value);
    }
}