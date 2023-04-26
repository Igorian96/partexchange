package ru.application.partexchange.service;

import ru.application.partexchange.dto.ProductDto;
import ru.application.partexchange.dto.ProductDtoCreate;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    List<ProductDto> getAll();
    void create(ProductDtoCreate request);
    void update(ProductDtoCreate request);
    void delete(UUID uuid);
}
