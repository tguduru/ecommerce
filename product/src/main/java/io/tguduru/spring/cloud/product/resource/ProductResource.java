package io.tguduru.spring.cloud.product.resource;

import io.tguduru.spring.cloud.product.dao.ProductDAO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Guduru, Thirupathi (TG028792)
 */
@RestController
@RequestMapping(value = "/product")
public class ProductResource {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = { "application/json" })
    public ProductDAO productDetails(@PathVariable("id") final Integer productId) {
        ProductDAO.ProductDAOBuilder builder = ProductDAO.builder();
        builder.id(productId.longValue()).price(150.0).productName("Bose Headphones");
        return builder.build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(){
        return "Hello, world !!!";
    }

}
