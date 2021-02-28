package it.academy.web.controller;

import it.academy.service.PromoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    PromoService promoService;


    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(
            Model model
    ) {
        model.addAttribute("promoList", promoService.findAllPromo());
        return "index";
    }
}
