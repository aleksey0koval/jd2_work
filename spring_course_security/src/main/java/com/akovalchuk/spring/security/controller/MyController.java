package com.akovalchuk.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getInfoAllEmps(){
        return "view-for-all-employees";
    }

    @GetMapping("/hr_info")
    public String getInfoOnlyForHR(){
        return "view-for-hr";
    }

    @GetMapping("/manager_info")
    public String getInfoOnlyForManager(){
        return "view-for-managers";
    }
}
