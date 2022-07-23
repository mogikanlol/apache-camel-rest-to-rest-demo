package com.example.app;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class Client {

    private final RestTemplate restTemplate;

    public void execute() {
        String response = restTemplate.getForObject(
                "http://localhost:8080/camel/hello",
                String.class
        );
        System.out.println("Response = " + response);
    }

}
