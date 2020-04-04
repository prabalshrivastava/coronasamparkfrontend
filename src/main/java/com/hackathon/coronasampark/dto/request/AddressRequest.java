package com.hackathon.coronasampark.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequest {

    @ApiModelProperty(required = true, example = "taluka")
    private String taluka;

    @ApiModelProperty(required = true, example = "pincode")
    private Integer pincode;

    @ApiModelProperty(required = true, example = "area")
    private String area;

    @ApiModelProperty(required = true, example = "district")
    private String district;

    @ApiModelProperty(required = true, example = "city")
    private String city;

    @ApiModelProperty(required = true, example = "state")
    private String state;

    @ApiModelProperty(required = true, example = "country")
    public String country;
}
