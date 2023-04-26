package ru.application.partexchange.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.application.partexchange.dto.ProductDto;
import ru.application.partexchange.dto.ProductDtoCreate;
import ru.application.partexchange.entity.ProductEntity;
import ru.application.partexchange.repository.ProductRepository;
import ru.application.partexchange.service.ProductService;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDto> getAll() {
        List<ProductEntity> product = productRepository.findAll();
        return product.stream().map(ProductEntity::toProductDto).toList();
    }

    @Override
    public void create(ProductDtoCreate request) {
        var product = new ProductEntity();
        product.setPublishDate(request.getPublishDate());
        product.setProductName(request.getProductName());
        product.setProductDescription(request.getProductDescription());
        product.setProductStatus(request.getProductStatus());
        product.setContactPhone(request.getContactPhone());
        product.setProductPrice(request.getProductPrice());
        productRepository.save(product);
    }

    @Override
    public void update(ProductDtoCreate request) {

    }

    @Override
    public void delete(UUID uuid) {
        var product = productRepository.findByUuid(uuid);
        productRepository.delete(product);
    }
}
