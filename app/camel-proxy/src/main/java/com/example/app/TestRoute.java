package com.example.app;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TestRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        restConfiguration()
                .host("localhost")
                .port(8080);

        from("rest:get:hello")
                // https://camel.apache.org/components/3.13.x/http-component.html
                // https://tomd.xyz/camel-call-rest-http/
                // ?httpMethod=GET&bridgeEndpoint=true
                .to("http://localhost:8082/f?bridgeEndpoint=true")
                // https://camel.apache.org/components/3.13.x/eips/content-enricher.html
                .setBody(body().append(" from Transform"));
    }
}
