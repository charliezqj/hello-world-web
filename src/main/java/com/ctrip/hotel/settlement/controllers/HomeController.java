package com.ctrip.hotel.settlement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by qjzhuo on 2016/11/18.
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("message", "Hello 小桌!");
        // return "WEB-INF/views/home.jsp";
        return "home";
    }
}
