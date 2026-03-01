package com.capg.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @GetMapping("/product")
    public String showForm(Model model) {
        model.addAttribute("product", new Product());
        return "ProductForm";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product, Model model) {
        model.addAttribute("prod", product);
        return "ProductSuccess";
    }
}