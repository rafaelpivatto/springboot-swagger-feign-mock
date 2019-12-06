package com.example.demo.usecases;

import com.example.demo.domains.Demo;
import com.example.demo.gateway.client.DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoRequest {

    private DemoClient demoClient;

    @Autowired
    public DemoRequest(DemoClient demoClient) {
        this.demoClient = demoClient;
    }

    public Demo execute() {
        return demoClient.getRandomMock();
    }
}
