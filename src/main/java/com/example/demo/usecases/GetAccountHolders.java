package com.example.demo.usecases;

import com.example.demo.domains.AccountHolders;
import com.example.demo.domains.Demo;
import com.example.demo.gateway.client.DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetAccountHolders {

    private DemoClient demoClient;

    @Autowired
    public GetAccountHolders(DemoClient demoClient) {
        this.demoClient = demoClient;
    }

    public AccountHolders execute() {
        return demoClient.getAccountHolders("empty body");
    }
}
