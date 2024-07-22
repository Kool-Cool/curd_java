package com.example.curd_java.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.curd_java.models.Product;
import com.example.curd_java.service.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProjectsControler {
    
    @Autowired
    private ProductRepository repo;
    
    @GetMapping({"" , "/"})
    public String showProductList(Model model){
        List<Product> products = repo.findAll();
        model.addAttribute("products",products);
        return "products/index" ;
    }
}
