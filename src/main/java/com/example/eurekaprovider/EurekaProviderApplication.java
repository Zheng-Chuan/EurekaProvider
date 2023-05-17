package com.example.eurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class EurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class, args);
    }

    @RequestMapping(value = "/provider/{id}")
    public Map providerMethod(@PathVariable(value = "id") Integer id) {
        Map map = new HashMap<>();
        map.put(id.toString(), "Provider");
        return map;
    }

}





