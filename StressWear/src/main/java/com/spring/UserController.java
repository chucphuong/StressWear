package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/home-page")
    public String index() {
        return "index";
    }

    @GetMapping("/User/about")
    public String about() {
        return "User-about-page";
    }

    @GetMapping("/User/contact")
    public String contact() {
        return "User-contact-page";
    }

    @GetMapping("/User/blog")
    public String blog() {
        return "User-blog-page";
    }

    @GetMapping("/User/product")
    public String product() {
        return "User-product-page";
    }
}
