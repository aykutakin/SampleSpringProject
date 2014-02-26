package com.mydomain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Dummy test class
 * 
 * @author Aykut
 * 
 */

@Controller
@RequestMapping("/dummy")
public class DummyController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "Hello World!";
    }
    
}
