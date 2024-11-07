package org.example.redmadenv2.Home;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    // Route for the company password login page
    @GetMapping("/passwordCompany")
    public String passwordCompany() {
        return "passwordCompany"; // Renders passwordCompany.html
    }

    // Route for the organization password login page
    @GetMapping("/passwordOrg")
    public String passwordOrg() {
        return "passwordOrg"; // Renders passwordOrg.html
    }

    @GetMapping("/company-site")
    public String companySite() {
        return "company-site";
    }

    @PostMapping("/companyLogin")
    //request
    public String handleCompanyLogin(@RequestParam("username") String username,
                                     @RequestParam("password") String password) {
        return "redirect:/company-site";
    }

    @PostMapping("/OrgLogin")
    public String handleOrgLogin(@RequestParam("username") String username,
                                 @RequestParam("password") String password) {
        // You can add validation here if needed, but for now, we redirect to org-site after login
        return "redirect:/org-site";  // Redirect to the organisation site after login
    }

    @GetMapping("/org-site")
    public String orgSite() {
        return "org-site";  // Render the org-site.html page
    }
    @GetMapping("/createProduct")
    public String createProduct() {
        return "createProduct"; // This renders createProduct.html
    }
    @GetMapping("/handleDonation")
    public String handleDonation() {
        return "handleDonation";
        }
    @GetMapping("/readAboutFoodWaste")
    public String readAboutFoodWaste() {
        return "readAboutFoodWaste";
    }
    }

