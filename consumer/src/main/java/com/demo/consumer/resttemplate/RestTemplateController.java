package com.demo.consumer.resttemplate;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/rest-template")
public class RestTemplateController {

    private final RestTemplateClient restTemplateClient;


    @GetMapping("/instance")
    public String getInstace(){
        return restTemplateClient.getInstanceInfo();
    }
}
