package com.example.demo.gateway.client;

import com.example.demo.domains.AccountHolders;
import com.example.demo.domains.Demo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@FeignClient(name = "DemoClient",
        url = "https://itau-iti.getsandbox.com")
public interface DemoClient {

    @RequestMapping(value = "/random", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    Demo getRandomMock();

    @RequestMapping(value = "/bankaccounts/v2/account-holders/search", method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE)
    AccountHolders getAccountHolders(@RequestBody String body);
}
