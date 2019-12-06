package com.example.demo.gateway.http;

import com.example.demo.domains.AccountHolders;
import com.example.demo.domains.Demo;
import com.example.demo.usecases.GetAccountHolders;
import com.example.demo.usecases.DemoRequest;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Api(tags = "Operations for sandbox", produces = MediaType.APPLICATION_JSON_VALUE)
public class DemoController {

    private DemoRequest demoRequest;
    private GetAccountHolders getAccountHolders;

    @Autowired
    public DemoController(DemoRequest demoRequest, GetAccountHolders accountHolders) {
        this.demoRequest = demoRequest;
        this.getAccountHolders = accountHolders;
    }

    @ApiOperation(value = "get mock from sandbox")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Ok", response = Demo.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    @RequestMapping(value = "/getMock", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Demo> get() {

        Demo demo = demoRequest.execute();
        return new ResponseEntity<Demo>(demo, HttpStatus.OK);
    }

    @ApiOperation(value = "get mock from sandbox")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Ok", response = Demo.class),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    @RequestMapping(value = "/bankaccounts/v2/account-holders/search", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AccountHolders> getGetAccountHolders() {

        AccountHolders accountholders = getAccountHolders.execute();
        return new ResponseEntity<AccountHolders>(accountholders, HttpStatus.OK);
    }
}
