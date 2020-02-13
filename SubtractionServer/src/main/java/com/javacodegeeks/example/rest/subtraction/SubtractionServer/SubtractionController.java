package com.javacodegeeks.example.rest.subtraction.SubtractionServer;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SubtractionController {
    protected Logger logger = Logger.getLogger(SubtractionController.class
            .getName());


    //@RequestMapping("/subtract")
    //public String doAdd(@RequestParam(name="sub1") String addend1, @RequestParam(name="sub2") String addend2) {

    @RequestMapping("/subtract/{sub1}/{sub2}")
    public String doAdd(@PathVariable("sub1") String addend1, @PathVariable("sub2") String addend2) {
        int augend1 = Integer.valueOf(addend1);
        int augend2 = Integer.valueOf(addend2);
        int substract = augend1 - augend2;
        return "{\"addend1\":\"" + addend1 + "\", \"addend2\":\"" + addend2 + "\", \"Substract\": \"" + substract + "\"}";
    }
}