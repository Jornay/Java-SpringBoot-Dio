package com.digitallucasinnovation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {
    
    @Value("${app.message}")
    private String appMessege;

    @GetMapping("/")
    public String getAppMessage(){
        return this.appMessege;
    }
}
