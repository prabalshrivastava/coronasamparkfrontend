package com.hackathon.coronasampark.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PatientRequest {
    @ApiModelProperty(required = true, value = "", example = "")
    private String name;
}
