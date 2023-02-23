package com.spring.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    Logger logger = (Logger) LoggerFactory.getLogger(ProductController.class);

    // for url: GET localhost:8081/getProduct?productName=phone&productId=123&productRating=4.5
    @GetMapping("/getProduct")
    // by default, all are required
    // default value is MUST for required=false, vice-versa is not true
    // (checked for primitives, yet to see for objects)
    public String getProduct(@RequestParam() String productName,
                             @RequestParam(value = "productRating", defaultValue = "0.0", required = false) double rating,
                             @RequestParam(value = "productId", required = false) int id){
        // Observe the naming in @RequestParam, same name, ignore in parameters
//        System.out.println("Product Name: " + productName);
//        System.out.println("Product ID: " + id);
//        System.out.println("Product Rating: " + rating);

        logger.error("Product Name: " + productName + " is not right !!");
        logger.warn("Product Id: " + id + " should be longer");
        logger.info("Product Rating: " + rating + " better be integer");

        return "This is testing product url";
    }

    // here order is IMPORTANT
    // url: localhost:8081/checkProduct/123/iphone/4.5
    @GetMapping("/checkProduct/{productId}/{productName}/{productRating}")
    public String checkProduct(
            @PathVariable("productId") int id,
            @PathVariable() String productName,
            @PathVariable("productRating") double rating
    ){
//        System.out.println("Product Name: " + productName);
//        System.out.println("Product ID: " + id);
//        System.out.println("Product Rating: " + rating);

        logger.error("Product Name: " + productName + " is not right !!");
        logger.warn("Product Id: {}", id);
        logger.info("Product Rating: " + rating + " better be integer");
        logger.debug("Just for debugging");

        return "This is testing check product url";
    }


}
