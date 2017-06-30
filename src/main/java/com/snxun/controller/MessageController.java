package com.snxun.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Keven on 2017/6/30.
 */
@Controller
public class MessageController {

    @RequestMapping("/test")
    public String testcontroller(){
        return "index";
    }
}
