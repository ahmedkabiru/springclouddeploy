package com.hamsoft.deploytoheroku;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By kabiruahmed on Jan 2019
 */

@RestController
public class ApiController {

    @RequestMapping("/")
    public String hello() {
        return "You Have successfully deploy to Heroku";
    }

}
