package com.javacodegeeks.example.rest.WebServer.WebServerNew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
class CalculateController {

    @Autowired

    RestTemplate restTemplate;
    String serviceUrl;


    @RequestMapping("/add")
    public String add(@RequestParam(name = "op1", defaultValue = "0") int op1, @RequestParam(name = "op2", defaultValue = "0") int op2){
        return restTemplate.getForObject("http://ADDITION-SERVICE" + "/add/{add1}/{add2}", String.class, op1, op2);
    }
    @RequestMapping("/sub")
    public String sub(@RequestParam(name = "op1", defaultValue = "0") int op1, @RequestParam(name = "op2", defaultValue = "0") int op2){
        return restTemplate.getForObject("http://SUBTRACTION-SERVICE" + "/subtract/{sub1}/{sub2}", String.class, op1, op2);
    }


}
