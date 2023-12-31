package com.lochetti.investments.controllers;

import com.lochetti.investments.models.Asset;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping(value = "/")
    public String index(Model model) {
        var asset = new Asset("IWDA");

        model.addAttribute("asset", asset);
        return "index";
    }

    @RequestMapping(value = "/number")
    public String getNumber(Model model) {
        var number = (int) (Math.random() * 10);

        model.addAttribute("number", number);
        return "fragments/yo :: random-number";
    }
}
