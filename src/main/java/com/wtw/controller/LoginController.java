package com.wtw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

/**
 * Created by Admin on 2016-03-01.
 */
@Controller
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/login-error")
    public String loginError(Model model) {
        logger.info("Błedne logowanie");
        model.addAttribute("loginError", true);
        return "login";
    }

    @RequestMapping("/login")
    public String loginPage(Model model, @RequestParam Optional<String> error) {
        model.addAttribute("error", error);
        logger.info("Logowanie");
        return "login";
    }
}
