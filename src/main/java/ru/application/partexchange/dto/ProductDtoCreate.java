package ru.application.partexchange.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@AllArgsConstructor
@Data
public class ProductDtoCreate {
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
