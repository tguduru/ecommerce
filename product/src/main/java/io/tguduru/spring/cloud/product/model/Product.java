package io.tguduru.spring.cloud.product.model;

/**
 * @author Guduru, Thirupathi Reddy
 */
public class Product {
    private String productName;
    private Long id;
    private Double price;

    public Product(String productName, Long id, Double price) {
        this.productName = productName;
        this.id = id;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public Long getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("productName='").append(productName).append('\'');
        sb.append(", id=").append(id);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
