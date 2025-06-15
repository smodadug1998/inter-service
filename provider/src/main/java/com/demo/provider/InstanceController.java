package com.demo.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstanceController {

    @Value("${server.port}")
    String port;

    @GetMapping("/instance-info")
    public String getInstanceInfo(){
        System.out.println("Request received at instance running on port " +  port);
        return "Instance served by port : " + port;
    }
}
