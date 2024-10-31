package com.mahfuz.orbitApiTest.service;

import com.mahfuz.orbitApiTest.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product( 101, "First", "http://128.199.138.204/mahfuz/image/countryFlag/Bangladesh.png"),
            new Product( 102,  "Second",  "http://128.199.138.204/mahfuz/image/countryFlag/India.png"),
            new Product( 103,  "Third",  "http://128.199.138.204/mahfuz/image/countryFlag/Argentina.png"),
            new Product( 104,  "Forth",  "http://128.199.138.204/mahfuz/image/countryFlag/singapore.png")
    );

    public List<Product> getProducts()
    {
        return products;
    }
}
