package ru.application.partexchange.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;
import java.util.UUID;

@AllArgsConstructor
@Data
public class ProductDto {
    @JsonProperty("uuid")
    UUID uuid;
    @JsonProperty("product_id")
    Integer productId;
    @JsonProperty("publish_date")
    Date publishDate;
    @JsonProperty("product_name")
    String productName;
    @JsonProperty("product_description")
    String productDescription;
    @JsonProperty("product_status")
    String productStatus;
    @JsonProperty("contact_phone")
    Integer contactPhone;
    @JsonProperty("product_price")
    Long productPrice;
}
