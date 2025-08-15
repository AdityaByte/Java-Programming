package com.stripe.payment.controller;

import com.stripe.payment.dto.ProductRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/product")
public class HomeController {

    @GetMapping
    public String home(Model model) {
        List<ProductRequest> products = List.of(
                ProductRequest.builder().name("Iphone-14").amount(10000L).quantity(1L).currency("USD").build(),
                ProductRequest.builder().name("O-riely Book").amount(1000L).quantity(1L).currency("USD").build()
        );
        model.addAttribute("products", products);
        return "home";
    }

    @GetMapping("/success")
    public String successPage() {
        return "success";
    }

    @GetMapping("/cancel")
    public String failurePage() {
        return "failure";
    }
}
