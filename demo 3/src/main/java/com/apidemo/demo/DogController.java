package com.apidemo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DogController {

    @GetMapping("/random-dog")
    public Dog getRandomDog() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://dog.ceo/api/breeds/image/random";
        Dog dog = restTemplate.getForObject(url, Dog.class);
        return dog;
    }
}
