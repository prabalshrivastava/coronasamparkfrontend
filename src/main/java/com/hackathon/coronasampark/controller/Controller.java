package com.hackathon.coronasampark.controller;

import com.hackathon.coronasampark.utill.GoogleContactsUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;
import java.io.IOException;
import java.security.Principal;
import java.util.Map;

@RestController
public class Controller {

    @Inject
    GoogleContactsUtil googleContactsUtil;
    @Autowired
    private OAuth2AuthorizedClientService authorizedClientService;

    @GetMapping("/")
    public String helloWorld() {
        return "you don't need to be logged in";
    }

    @GetMapping("/not-restricted")
    public String notRestricted() {
        return "you don't need to be logged in";
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "if you see this you are logged in";
    }
//    @GetMapping("/profile")
//    public String profile(OAuth2AuthenticationToken authentication) {
//        OAuth2AuthorizedClient client = authorizedClientService
//                .loadAuthorizedClient(authentication.getAuthorizedClientRegistrationId(),
//                        authentication.getName());
//
//
//        String userInfoEndpointUri = client.getClientRegistration()
//                .getProviderDetails().getUserInfoEndpoint().getUri();
//
//        if (!StringUtils.isEmpty(userInfoEndpointUri)) {
//            RestTemplate restTemplate = new RestTemplate();
//            HttpHeaders headers = new HttpHeaders();
//            headers.add(HttpHeaders.AUTHORIZATION, "Bearer " + client.getAccessToken()
//                    .getTokenValue());
//            HttpEntity entity = new HttpEntity("", headers);
//            ResponseEntity<Map> response = restTemplate
//                    .exchange(userInfoEndpointUri, HttpMethod.GET, entity, Map.class);
//            Map userAttributes = response.getBody();
//        }
//        return "if you see this you are logged in";
//    }

    @GetMapping("/profile")
    public String profile(Principal principal) throws IOException {
        String name = principal.getName();
        googleContactsUtil.setUp();
        return "if you see this you are logged in";
    }
}
