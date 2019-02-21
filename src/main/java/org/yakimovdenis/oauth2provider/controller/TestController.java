package org.yakimovdenis.oauth2provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/test")
    public @ResponseBody String fuck(){
        return "FUCK";
    }
}
