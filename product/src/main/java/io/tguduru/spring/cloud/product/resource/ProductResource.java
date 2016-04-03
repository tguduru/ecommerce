package io.tguduru.spring.cloud.product.resource;

import io.tguduru.spring.cloud.product.model.Product;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Guduru, Thirupathi Reddy
 */
@RestController
@RequestMapping(value = "/product")
public class ProductResource {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = { "application/json" })
    public Product productDetails(@PathVariable("id") final Long productId) {
        return new Product("iPhone", productId, 145.0);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello() {
        return "Hello, world !!!";
    }

}
