package com.eudaimonia.swissarmysteel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class SwissarmysteelController {
    @RequestMapping(path="/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello SpringBoot 3!";
    }
}
