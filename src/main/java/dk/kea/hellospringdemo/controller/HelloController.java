package dk.kea.hellospringdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hellospring")
    public String helloSpring(){
        return "Hello Spring!";
    }

    @GetMapping("/")
    public String defaultPage(){
        return "Godmorgen!";
    }

    @GetMapping("/parametertest")
    public String parameter(@RequestParam String mintekst, @RequestParam String minandentekst){
        return mintekst + " " + minandentekst;
    }

}
