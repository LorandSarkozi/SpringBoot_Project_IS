package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    // Handles request at certain paths

    /*@GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "Hello,Spring!";
    }*/

    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye,Spring!";
    }

    // Handles request of the form /hello?name=Lorand
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST}, value="hello")
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }

    // Handles requests of the form /hello/Lorand
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +  //submit a request at /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "<form>" +
                "<body>" +
                "<html>";
    }
}
