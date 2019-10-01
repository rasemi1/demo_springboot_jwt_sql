package com.onkov.demo.controlers;

import com.onkov.demo.dtos.HomeModelDTO;
import com.onkov.demo.services.HelloService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final Logger logger = LogManager.getLogger(HomeController.class);

    private HelloService helloService;

    @Autowired
    public HomeController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/")
    public String hello(){
        logger.info("123");
        return "abv";
    }

    @GetMapping("/home")
    public HomeModelDTO homeObject(){
        logger.info("1234");
        return helloService.helloObj();
    }

    @GetMapping("/hidden")
    public String hiddenMsg(){
        logger.info("12345");
        return "Secret";
    }
}
