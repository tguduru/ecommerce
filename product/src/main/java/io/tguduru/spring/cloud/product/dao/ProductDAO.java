package io.tguduru.spring.cloud.product.dao;

import lombok.*;

/**
 * @author Guduru, Thirupathi (TG028792)
 */
@Builder
@ToString
@EqualsAndHashCode
public class ProductDAO {
    @Getter
    private String productName;
    @Getter
    private Long id;
    @Getter
    private Double price;
}
