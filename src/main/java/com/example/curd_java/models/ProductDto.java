package com.example.curd_java.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ProductDto {
    
    @NotEmpty(message = "The name is required")
    private String name;

    @NotEmpty(message = "The brand is required")
    private String brand;

    @NotEmpty(message = "Category needed")
    private String category;

    @Min(0)
    private double price;

    @Size(min = 10, message = "Too short description")
    @Size(max = 2000, message = "Too long")
    private String description;
}
