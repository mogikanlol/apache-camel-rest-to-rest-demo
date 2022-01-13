package com.example.app;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class TestRoute extends RouteBuilder {

    @Autowired
    private Environment env;

    @Override
    public void configure() throws Exception {
        restConfiguration()
                .host("localhost")
                .port(8080);

        from("rest:get:hello")
                // https://camel.apache.org/components/3.13.x/http-component.html
                // https://tomd.xyz/camel-call-rest-http/
                .to("http://localhost:8082/f?httpMethod=GET&bridgeEndpoint=true")
                // https://camel.apache.org/components/3.13.x/eips/content-enricher.html
                .setBody(body().append(" from Transform"));
    }
}
