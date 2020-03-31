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

    @Value("${dto.enum.addCard.cardIssuanceAction}")
    private List<String> cardIssuanceAction;

    @Value("${dto.enum.addCard.cardType}")
    private List<String> cardType;

    @Value("${dto.enum.addCard.issuanceMode}")
    private List<String> issuanceMode;

    @Value("${dto.enum.lockUnlockCard.blockAction}")
    private List<String> blockAction;

    @Value("${dto.enum.channelRestrictions.channel}")
    private List<String> channel;

    @Value("${dto.enum.channelRestrictions.action}")
    private List<String> action;


    //Messages Picked from Properties File
    @Value("${dto.enum.addCard.cardIssuanceActionMessage}")
    private String cardIssuanceActionMessage;

    @Value("${dto.enum.addCard.cardTypeMessage}")
    private String cardTypeMessage;

    @Value("${dto.enum.addCard.issuanceModeMessage}")
    private String issuanceModeMessage;

    @Value("${dto.enum.blockUnlockCard.blockActionMessage}")
    private String blockActionMessage;

    @Value("${dto.enum.channelRestrictions.channelMessage}")
    private String channelMessage;

    @Value("${dto.enum.channelRestrictions.actionMessage}")
    private String actionMessage;

}
