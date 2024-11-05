package org.example.redmadenv2.Home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String index(Model model) {
        return "Home/index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/company-site")
    public String companySite() {
        return "company-site";
    }

    @GetMapping("/org-site")
    public String orgSite() {
        return "org-site";
    }
}