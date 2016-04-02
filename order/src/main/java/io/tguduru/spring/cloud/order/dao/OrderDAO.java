package io.tguduru.spring.cloud.order.dao;

import com.google.common.base.Objects;

import java.util.List;

/**
 * @author Guduru, Thirupathi (TG028792)
 */
public class OrderDAO {
    private Long id;
    private Long quantity;
    private Double totalPrice;
    private List<Long> products;

    public Long getId() {
        return id;
    }

    public OrderDAO setId(final Long id) {
        this.id = id;
        return this;
    }

    public Long getQuantity() {
        return quantity;
    }

    public OrderDAO setQuantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public OrderDAO setTotalPrice(final Double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public List<Long> getProducts() {
        return products;
    }

    public OrderDAO setProducts(final List<Long> products) {
        this.products = products;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final OrderDAO orderDAO = (OrderDAO) o;
        return Objects.equal(id, orderDAO.id) &&
                Objects.equal(quantity, orderDAO.quantity) &&
                Objects.equal(totalPrice, orderDAO.totalPrice) &&
                Objects.equal(products, orderDAO.products);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, quantity, totalPrice, products);
    }
}
