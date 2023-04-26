package ru.application.partexchange.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import ru.application.partexchange.dto.ProductDto;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Entity
@Data
@EqualsAndHashCode
@Table(name = "products", schema = "owners")
public class ProductEntity {
    @Column(name = "uuid")
    private UUID uuid = UUID.randomUUID();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @CreationTimestamp
    @Column(name = "publish_date")
    private Date publishDate;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_description")
    private String productDescription;
    @Column(name = "product_status")
    private String productStatus;
    @Column(name = "contact_phone")
    private Integer contactPhone;
    @Column(name = "product_price")
    private Long productPrice;

    public ProductDto toProductDto() {
        return new ProductDto(
                getUuid(),
                getProductId(),
                getPublishDate(),
                getProductName(),
                getProductDescription(),
                getProductStatus(),
                getContactPhone(),
                getProductPrice()
        );
    }
}
