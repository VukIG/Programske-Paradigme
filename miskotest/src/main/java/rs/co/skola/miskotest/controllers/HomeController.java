package rs.co.skola.miskotest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping("/")
    public String Home() {
        return "index";
    }

}
